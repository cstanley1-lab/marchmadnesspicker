package edu.guilford;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class headtohead extends JPanel {
    // displays head to head stats and comparisons between two teams in a matchup
    // will be used in the GUI to provide users with information to help them make informed picks

    private matchup currentMatchup;
    private JPanel team1Panel;
    private JPanel team2Panel;

    // constructor to create the head to head panel with the current matchup
    public headtohead(matchup currentMatchup) {
        this.currentMatchup = currentMatchup;

        setLayout(new GridLayout(1,2));
        // create the panels for each team
        team1Panel = createTeamPanel(currentMatchup.getTeam1(), true);
        team2Panel = createTeamPanel(currentMatchup.getTeam2(), false);
        add(team1Panel);
        add(team2Panel);

    }

    // creates a panel for one team 

    private JPanel createTeamPanel(TeamInfo team, boolean isTeam1) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // team header 

        JLabel nameLabbel = new JLabel(team.toString());
        nameLabbel.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(nameLabbel);

        panel.add(new JLabel("Coach: " + team.getCoachName()));
        panel.add(new JLabel("Record: " + team.getWins() + "-" + team.getLosses()));

        panel.add(Box.createRigidArea(new Dimension(0,10)));

        // stat comparisons 
        boolean team1BetterPPG = currentMatchup.getTeam1().getPpg() >= currentMatchup.getTeam2().getPpg();
        panel.add(createStatLabel("PPG", team.getPpg(), isTeam1 ? team1BetterPPG : !team1BetterPPG));

        return panel;
    }

    private JLabel createStatLabel(String statName, double statValue, boolean highlight) {
        JLabel label = new JLabel(statName + ": " + statValue);
        if (highlight) {
            label.setFont(label.getFont().deriveFont(Font.BOLD));
        }
        return label;
    }
    

}
