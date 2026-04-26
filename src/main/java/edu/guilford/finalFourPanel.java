package edu.guilford;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

 class FinalFourPanel extends JPanel {

    // this class will display the final four tournament
    // the 4 regional champions will be displayed and later be picked for who is the
    // national champion

    private ArrayList<Team> finalFourTeams;
    private Bracket bracket;
    private BracketPanel bracketPanel;

    private ArrayList<Team> currentRound;
    private ArrayList<Team> semifinalWinners;
    private int currentMatchupIndex;
    private JPanel matchupDisplayPanel;

    public FinalFourPanel(ArrayList<Team> finalFourTeams, Bracket bracket,
            BracketPanel bracketPanel) {
        setLayout(new BorderLayout());
        setBackground(new Color(40, 40, 40));

        this.finalFourTeams = finalFourTeams;
        this.bracket = bracket;
        this.bracketPanel = bracketPanel;

        // initialize the final four
        this.currentRound = new ArrayList<>(finalFourTeams);
        this.semifinalWinners = new ArrayList<>();
        this.currentMatchupIndex = 0;

        // creating our header label
        JLabel header = new JLabel("Final four", JLabel.CENTER);
        header.setFont(new Font("Arial", Font.BOLD, 32));
        header.setOpaque(true);
        header.setBackground(new Color(30, 30, 30));
        header.setForeground(Color.WHITE);
        add(header, BorderLayout.NORTH);

        // creating our round label
        JLabel roundLabel = new JLabel("Semifinals", JLabel.CENTER);
        roundLabel.setFont(new Font("Arial", Font.BOLD, 18));
        roundLabel.setOpaque(true);
        roundLabel.setBackground(new Color(50, 50, 50));
        roundLabel.setForeground(Color.YELLOW);
        add(roundLabel, BorderLayout.SOUTH);

        // creating our matchup display panel

        matchupDisplayPanel = new JPanel();
        matchupDisplayPanel.setLayout(new BorderLayout());
        matchupDisplayPanel.setBackground(new Color(40, 40, 40));
        add(matchupDisplayPanel, BorderLayout.CENTER);

        // show the first final four matchup
        showNextMatchup();
    }

    // method to display the next matchup in the FInal four
    private void showNextMatchup() {

        // making sure the semifinal is complete
        if (currentMatchupIndex >= 2) {
            // both semifinals are done so go on to the championship
            showChampionship();
            return;

        }

        // getting our semifinal matchup
        Team team1 = currentRound.get(currentMatchupIndex * 2);
        Team team2 = currentRound.get((currentMatchupIndex * 2) + 1);

        Game currentGame = new Game(team1, team2);

        // displaying the matchup panel

        matchupDisplayPanel.removeAll();
        FinalMatchupPanel matchupPanel = new FinalMatchupPanel(currentGame, this, false);
        matchupDisplayPanel.add(matchupPanel, BorderLayout.CENTER);

        matchupDisplayPanel.revalidate();
        matchupDisplayPanel.repaint();

    }

    // displaying the championship game
    // national champion

    private void showChampionship() {
        if (semifinalWinners.size() < 2) {
            return;
        }

        // getting the two finalists
        Team finalist1 = semifinalWinners.get(0);
        Team finalist2 = semifinalWinners.get(1);

        Game championship = new Game(finalist1, finalist2);

        // display championship matchup
        matchupDisplayPanel.removeAll();

        JLabel championshipLabel = new JLabel("National Championship Game", JLabel.CENTER);
        championshipLabel.setFont(new Font("Arial", Font.BOLD, 20));
        championshipLabel.setOpaque(true);
        championshipLabel.setBackground(new Color(50, 50, 50));
        championshipLabel.setForeground(Color.YELLOW);
        matchupDisplayPanel.add(championshipLabel, BorderLayout.NORTH);

        FinalMatchupPanel finalMatchup = new FinalMatchupPanel(championship, this,true);
        matchupDisplayPanel.add(finalMatchup, BorderLayout.CENTER);

        matchupDisplayPanel.revalidate();
        matchupDisplayPanel.repaint();
    }

    // when our matchup is complete, this method is called to update the current
    // round and show the next matchup or championship
    public void onMatchupComplete(Team winner) {

        semifinalWinners.add(winner);
        currentMatchupIndex++;
        if (currentMatchupIndex >= 2) {
            showChampionship();
        } else {
            showNextMatchup();
        }
    }

    public void onChampionshipComplete(Team champion) {
        bracket.setChampion(champion);
        bracketPanel.onTournamentComplete(champion);
    }



}
