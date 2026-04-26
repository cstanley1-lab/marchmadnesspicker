package edu.guilford;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MatchupPanel extends JPanel {

    // this class will display our head to head comparison of two teams in a single amtchup
    // will show statistics with color coding to indicate which team is better in each category
    // allows the user to pick a winner and possible ask for a suggestion

    private Game game;

    private RegionalTournamentPanel regionPanel;

    private JPanel team1Panel;
    private JPanel team2Panel;

    // constructor to create the matchup panel display 

     public MatchupPanel(Game game, RegionalTournamentPanel regionPanel) {
        this.game = game;
        this.regionPanel = regionPanel;

        setLayout(new BorderLayout(10,10));
        setBackground(new Color(40,40,40));
 
        // Layout: 2 columns for team vs team comparison
       // setLayout(new GridLayout(1, 2, 10, 10));
       JPanel teamsPanel = new JPanel(new GridLayout(1,2,10,10));
        setBackground(new Color(40, 40, 40));
        
        // Create panels for each team
        team1Panel = createTeamPanel(game.getTeam1(), true);
        team2Panel = createTeamPanel(game.getTeam2(), false);
 
        teamsPanel.add(team1Panel);
        teamsPanel.add(team2Panel);
        add(teamsPanel, BorderLayout.CENTER);
        
        add(createSuggestedPickPanel(), BorderLayout.SOUTH);
    }

    // new method to create the suggested pick panel at the bottom
    private JPanel createSuggestedPickPanel() { 
        JPanel panel = new JPanel( new BorderLayout(10,5));
        panel.setBackground( new Color(30,30,30));
        panel.setBorder(new EmptyBorder(10,20,10,20));

        String prediction = game.getPredictionStatement();
        Team suggestedWinner = game.getSuggestedWinner();

        JLabel predictionLabel = new JLabel ("Statistical prediction: " + prediction, JLabel.CENTER);
        predictionLabel.setFont(new Font("Arial", Font.BOLD, 13));
        predictionLabel.setForeground(Color.CYAN);
        panel.add(predictionLabel, BorderLayout.NORTH);

        JButton suggestedPickButton = new JButton();
        suggestedPickButton.setFont(new Font("Arial", Font.BOLD, 16));
        suggestedPickButton.setFocusPainted(false);

        if (suggestedWinner != null) {
            suggestedPickButton.setText("Suggested Pick: " + suggestedWinner.getName());
            suggestedPickButton.setBackground(new Color(100, 150, 100));
            suggestedPickButton.setForeground(Color.WHITE);
            // when the suggested pick button is clicked, we will automatically select that team as the winner and advance them in the bracket
            suggestedPickButton.addActionListener(e -> {
                game.setWinner(suggestedWinner);
                regionPanel.onMatchupComplete(suggestedWinner);
            });
        } else {
            suggestedPickButton.setText("No clear statistical pick");
            suggestedPickButton.setBackground(new Color(150, 150, 150));
            suggestedPickButton.setForeground(Color.WHITE);
            suggestedPickButton.setEnabled(false);
        }

        panel.add(suggestedPickButton, BorderLayout.CENTER);

        return panel;
    }

    // create a display panel for a single team with all the stats and info
    // show info stats and pick button 

    private JPanel createTeamPanel(Team team, boolean isTeam1) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(17, 1, 5, 5));
        panel.setBackground(new Color(50, 50, 50));
        
        // Team name header with seed
        JLabel name = new JLabel(team.toString(), JLabel.CENTER);
        name.setFont(new Font("Arial", Font.BOLD, 18));
        name.setForeground(Color.WHITE);
        panel.add(name);
 
        // Coach and record
        JLabel coach = new JLabel("Coach: " + team.getCoachName());
        coach.setFont(new Font("Arial", Font.PLAIN, 12));
        coach.setForeground(Color.LIGHT_GRAY);
        panel.add(coach);
        
        JLabel record = new JLabel("Record: " + team.getWins() + "-" + team.getLosses());
        record.setFont(new Font("Arial", Font.PLAIN, 12));
        record.setForeground(Color.LIGHT_GRAY);
        panel.add(record);
 
        // STAT COMPARISONS - These will be color-coded
        // Green = better, Red = worse
        
        panel.add(createStatLabel("PPG: " + String.format("%.1f", team.getPpg()), 
                                  isTeam1, "PPG"));
        panel.add(createStatLabel("Opp PPG: " + String.format("%.1f", team.getOppg()), 
                                  isTeam1, "OPPG"));
        panel.add(createStatLabel("Off Rating: " + String.format("%.1f", team.getOffensiveRating()), 
                                  isTeam1, "OffensiveRating"));
        panel.add(createStatLabel("Def Rating: " + String.format("%.1f", team.getDefensiveRating()), 
                                  isTeam1, "DefensiveRating"));
        panel.add(createStatLabel("Net Rating: " + String.format("%.1f", team.getNetRating()), 
                                  isTeam1, "NetRating"));
        panel.add(createStatLabel("EFG%: " + String.format("%.1f", team.getEfg()), 
                                  isTeam1, "EFG"));
        panel.add(createStatLabel("TO%: " + String.format("%.1f", team.getTurnoverPct()), 
                                  isTeam1, "TurnoverPct"));
        panel.add(createStatLabel("Reb%: " + String.format("%.1f", team.getReboundPct()), 
                                  isTeam1, "ReboundPct"));
        
        // builidng a method to create a stat label with color coding based on comparison with the other team
        // this method will compare the stat for this team with the other team and set the color accordingly
        // html labels for key players and playstyle, using html to allow for multiline text
        JLabel keyPlayers = new JLabel("<html>Key: " + team.getKeyPlayers() + "</html>");
        keyPlayers.setFont(new Font("Arial", Font.PLAIN, 11));
        keyPlayers.setForeground(Color.LIGHT_GRAY);
        panel.add(keyPlayers);
        
        JLabel playstyle = new JLabel("<html>Style: " + team.getPlaystyle() + "</html>");
        playstyle.setFont(new Font("Arial", Font.PLAIN, 11));
        playstyle.setForeground(Color.LIGHT_GRAY);
        panel.add(playstyle);
 
        // Pick button - this is how the user selects the winner
        JButton pickButton = new JButton("PICK " + team.getName());
        pickButton.setFont(new Font("Arial", Font.BOLD, 14));
        pickButton.setBackground(new Color(100, 150, 100));
        pickButton.setForeground(Color.WHITE);
        pickButton.setFocusPainted(false);
        
        // CHANGED: When pick button is clicked, notify parent tournament panel
        pickButton.addActionListener(e -> {
            game.setWinner(team);
            regionPanel.onMatchupComplete(team);
        });
        panel.add(pickButton);
 
        return panel;
    }

    // creating a stats label with color comparison 
      private JLabel createStatLabel(String statName, boolean isTeam1, String statType) {
        JLabel label = new JLabel(statName);
        label.setFont(new Font("Arial", Font.PLAIN, 12));
        boolean team1Better = false;

        // Determine which team has the better stat
        switch (statType) {
            case "PPG":
                team1Better = game.team1BetterPPG();
                break;
            case "OPPG":
                team1Better = game.team1BetterDefense();
                break;
            case "OffensiveRating":
                team1Better = game.team1BetterOffense();
                break;
            case "DefensiveRating":
                team1Better = game.team1BetterDefRating();
                break;
            case "NetRating":
                team1Better = game.team1BetterNetRating();
                break;
            case "EFG":
                team1Better = game.team1BetterEFG();
                break;
            case "TurnoverPct":
                team1Better = game.team1BetterTO();
                break;
            case "ReboundPct":
                team1Better = game.team1BetterReboundPct();
                break;
            default:
                return label;
        }

        // coloring the stat green if this team is better, red if worse
         if (team1Better) {
            label.setForeground(isTeam1 ? Color.GREEN : Color.RED);
        } else {
            label.setForeground(isTeam1 ? Color.RED : Color.GREEN);
        }
 
        return label;
}
}
