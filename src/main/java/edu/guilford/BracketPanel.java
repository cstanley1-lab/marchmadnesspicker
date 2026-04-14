package edu.guilford;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BracketPanel extends JPanel {
    // main GUI panel that will hold everything
    // Bracket matchups 
    // Buttons for picking teams
    // Controls for stats adn suggestions 

    // constructor
    public BracketPanel() {
        
        // create our title section and add it to the top of the panel
        setLayout(new BorderLayout());
        JLabel title = new JLabel ("March Madness Bracket Picker", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 28));
        add(title, BorderLayout.NORTH);

        // this panel will hold the bracket matchups
        // we will use a grid layout to organize the matchups in a bracket format
        JPanel bracketArea = new JPanel();
        bracketArea.setLayout(new GridLayout (8,2,10,10));

        // placeholder teams 
        for (int i =1; i<=16; i++) {
           
            // two teams for each matchup 
            JButton team1 = new JButton ("Team " + i);
            JButton team2 = new JButton ("Team " + (i+16));

            // our action listeners for our buttons to respond to the choosing of teams and update the bracket accordingly
            team1.addActionListener(new TeamButtonListener());
            team2.addActionListener(new TeamButtonListener());

            // add our buttons to the bracket area
            bracketArea.add(team1);
            bracketArea.add(team2);
        }
        add(bracketArea, BorderLayout.CENTER);

        // control panel for stats and suggestions
        // this will be on the bottom of the main panel
        JPanel controlPanel = new JPanel();

        // Button that shows more stats 
        JButton statsButton = new JButton("Show Stats");

        // button for suggested picks based on stats
        JButton suggestionButton = new JButton("Suggested Pick");

        // Button for possible upset predictions
        JButton upsetButton = new JButton("Upset Alert");

        // functionality and action listeners for these buttons will be implemented later, but we will add them to the control panel for now
        statsButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Stats functionality coming soon!");
        });

        suggestionButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Suggestion functionality coming soon!");
        });

        upsetButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Upset prediction functionality coming soon!");
        });

        // add buttons to the control panel
        controlPanel.add(statsButton);
        controlPanel.add(suggestionButton);
        controlPanel.add(upsetButton);

        add(controlPanel, BorderLayout.SOUTH);
    }
    // inner class for handling team button clicks
    private class TeamButtonListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {

            // get which button was clicked
            JButton clickedButton = (JButton) e.getSource();

            // Highlight the selected team (green) and update the bracket accordingly
            clickedButton.setBackground(Color.GREEN);

            // feedback for the button you picked
            JOptionPane.showMessageDialog(null, "You picked: " + clickedButton.getText());

        }
    }
}
