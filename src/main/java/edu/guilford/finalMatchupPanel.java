package edu.guilford;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

class FinalMatchupPanel {
    // tjos class will display the winners of the regions and turn it into the final four matchups and championship

    private Game game;

    private FinalFourPanel finalFourPanel;

    private boolean isChampionship;

    // constructor creates the final matchup display

     public FinalMatchupPanel(Game game, FinalFourPanel finalFourPanel, boolean isChampionship) {
        this.game = game;
        this.finalFourPanel = finalFourPanel;
        this.isChampionship = isChampionship;

        // Layout: 2 columns for team comparison
        setLayout(new GridLayout(1, 2, 15, 15));
        setBackground(new Color(30, 30, 30));
        
        // Create panels for each team
        JPanel team1Panel = createTeamPanel(game.getTeam1(), true);
        JPanel team2Panel = createTeamPanel(game.getTeam2(), false);
 
        add(team1Panel);
        add(team2Panel);
    }

    // creating a display panel for a single team with all the stats and info
      private JPanel createTeamPanel(Team team, boolean isTeam1) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(15, 1, 5, 5));
        panel.setBackground(new Color(60, 60, 60));
        
        // Team name header - emphasize the importance
        JLabel name = new JLabel(team.toString(), JLabel.CENTER);
        name.setFont(new Font("Arial", Font.BOLD, 22));
        name.setForeground(Color.YELLOW);
        panel.add(name);
 
        // Coach and record
        JLabel coach = new JLabel("Coach: " + team.getCoachName());
        coach.setFont(new Font("Arial", Font.PLAIN, 12));
        coach.setForeground(Color.WHITE);
        panel.add(coach);
        
        JLabel record = new JLabel("Record: " + team.getWins() + "-" + team.getLosses());
        record.setFont(new Font("Arial", Font.PLAIN, 12));
        record.setForeground(Color.WHITE);
        panel.add(record);
 
        // KEY STATISTICS - color coded for comparison
        
        panel.add(createStatLabel("PPG: " + String.format("%.1f", team.getPpg()), 
                                  isTeam1, "PPG"));
        panel.add(createStatLabel("Def PPG: " + String.format("%.1f", team.getOppg()), 
                                  isTeam1, "OPPG"));
        panel.add(createStatLabel("Off Rtg: " + String.format("%.1f", team.getOffensiveRating()), 
                                  isTeam1, "OffensiveRating"));
        panel.add(createStatLabel("Def Rtg: " + String.format("%.1f", team.getDefensiveRating()), 
                                  isTeam1, "DefensiveRating"));
        panel.add(createStatLabel("Net Rtg: " + String.format("%.1f", team.getNetRating()), 
                                  isTeam1, "NetRating"));
        panel.add(createStatLabel("EFG%: " + String.format("%.1f", team.getEfg()), 
                                  isTeam1, "EFG"));
        panel.add(createStatLabel("TO%: " + String.format("%.1f", team.getTurnoverPct()), 
                                  isTeam1, "TurnoverPct"));
        panel.add(createStatLabel("Reb%: " + String.format("%.1f", team.getReboundPct()), 
                                  isTeam1, "ReboundPct"));
        

        // html and /b and <br> are used because they allow for multiline text and basic formatting, 
        // which is useful for displaying key players and playstyle information in a readable way
        // Key players
        JLabel keyPlayers = new JLabel("<html><b>Key Players:</b><br>" + team.getKeyPlayers() + "</html>");
        keyPlayers.setFont(new Font("Arial", Font.PLAIN, 11));
        keyPlayers.setForeground(Color.LIGHT_GRAY);
        panel.add(keyPlayers);
        
        // Pick button - select the winner
        JButton pickButton = new JButton("CHOOSE " + team.getName());
        pickButton.setFont(new Font("Arial", Font.BOLD, 16));
        pickButton.setBackground(new Color(150, 100, 50));
        pickButton.setForeground(Color.WHITE);
        pickButton.setFocusPainted(false);
        
        
        pickButton.addActionListener(e -> {
            game.setWinner(team);

            if (isChampionship) {
                finalFourPanel.onChampionshipComplete(team);
            } else {
                finalFourPanel.onMatchupComplete(team);
            }
        });



            
            // Check if this is a championship game (both teams are regional champions)
            
        
        panel.add(pickButton);
 
        return panel;
    }

    // determine if this is a championship game or semifinal 
    // championship game has regional champions fromthe different regions 

   

    // creating a stat label with color coding comparison 
    private JLabel createStatLabel(String statName, boolean isTeam1, String statType) {
        JLabel label = new JLabel(statName);
        label.setFont(new Font("Arial", Font.PLAIN, 13));
        boolean team1Better = false;
 
        // Determine which team has the statistical advantage
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
        
        // Color: Green if team is better, Red if worse
        if (team1Better) {
            label.setForeground(isTeam1 ? Color.GREEN : Color.RED);
        } else {
            label.setForeground(isTeam1 ? Color.RED : Color.GREEN);
        }
 
        return label;
    }


}
