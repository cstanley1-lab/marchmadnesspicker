package edu.guilford;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

class RegionalTournamentPanel extends JPanel {
    // this displays our matchups from the round of 64 ( will call it round of 16
    // because it only shows 16 teams)
    // and allows the user to pick winners to advance to the sweet 16 and so forth
    // until we get a regional champion

    private String region;
    private ArrayList<Team> regionTeams;
    private Bracket bracket;
    private BracketPanel bracketPanel;

    // current round data
    private ArrayList<Team> currentRound;
    private ArrayList<Team> nextRoundWinners;
    private int currentMatchupIndex; // tracks which matchup we're on in the current round
    private String[] roundNames = { "Round of 16", "Round of 8", "Round of 4", "Regional Finals" };
    private int roundLevel; // 0 = round of 16, 1 = round of 8, etc.

    // GUI components
    private JPanel matchupDisplayPanel;
    private JLabel roundLabel;

    // constructor to initialize the regional tournament
    // east, west, south, midwest

    public RegionalTournamentPanel(String region, ArrayList<Team> regionTeams,
            Bracket bracket, BracketPanel bracketPanel) {
        setLayout(new BorderLayout());
        setBackground(new Color(40, 40, 40));

        this.region = region;
        this.regionTeams = regionTeams;
        this.bracket = bracket;
        this.bracketPanel = bracketPanel;

        // Initialize tournament state
        this.currentRound = new ArrayList<>(regionTeams);
        this.nextRoundWinners = new ArrayList<>();
        this.currentMatchupIndex = 0;
        this.roundLevel = 0;

        // Create header
        JLabel header = new JLabel(region + " REGION TOURNAMENT", JLabel.CENTER);
        header.setFont(new Font("Arial", Font.BOLD, 28));
        header.setOpaque(true);
        header.setBackground(new Color(30, 30, 30));
        header.setForeground(Color.WHITE);
        add(header, BorderLayout.NORTH);

        // Create round label
        roundLabel = new JLabel(roundNames[roundLevel], JLabel.CENTER);
        roundLabel.setFont(new Font("Arial", Font.BOLD, 18));
        roundLabel.setOpaque(true);
        roundLabel.setBackground(new Color(50, 50, 50));
        roundLabel.setForeground(Color.YELLOW);
        add(roundLabel, BorderLayout.SOUTH);

        // Create matchup display area
        matchupDisplayPanel = new JPanel();
        matchupDisplayPanel.setLayout(new BorderLayout());
        matchupDisplayPanel.setBackground(new Color(40, 40, 40));
        add(matchupDisplayPanel, BorderLayout.CENTER);

        // Show first matchup
        showNextMatchup();
    }

    // nextmatchup method
    // displays the next matchup in the current round, and if the round is complete,
    // advances to the next round until we have a regional champion

    private void showNextMatchup() {
        // Check if round is complete
        if (currentMatchupIndex >= currentRound.size() / 2) {
            // Advance to next round
            currentRound = new ArrayList<>(nextRoundWinners);
            nextRoundWinners.clear();
            roundLevel++;
            currentMatchupIndex = 0;

            if (roundLevel >= 4) {
                // Tournament complete - region champion crowned
                notifyRegionComplete(currentRound.get(0));
                return;
            }

            // Update round label
            roundLabel.setText(roundNames[roundLevel] + " - " + currentRound.size() + " teams remaining");
        }

        // get the teams for the current matchup
        Team team1 = currentRound.get(currentMatchupIndex * 2);
        Team team2 = currentRound.get(currentMatchupIndex * 2 + 1);

        Game currentGame = new Game(team1, team2);

        // displaying the matchup panel

        matchupDisplayPanel.removeAll();
        MatchupPanel matchupPanel = new MatchupPanel(currentGame, this);
        matchupDisplayPanel.add(matchupPanel, BorderLayout.CENTER);

        // refresh the display
        // this is important to ensure the new matchup panel is shown after we update it
        matchupDisplayPanel.revalidate();
        matchupDisplayPanel.repaint();
    }

    // matchup complete method
    // when a matchup winner is selected this advances the winner and shows the next
    // matchup
    public void onMatchupComplete(Team winner) {
        nextRoundWinners.add(winner);
        currentMatchupIndex++;

        showNextMatchup();
    }

    private void notifyRegionComplete(Team champion) {
        if (bracketPanel == null) {
            return;
        }

        bracketPanel.onRegionComplete(champion);
    }
}
