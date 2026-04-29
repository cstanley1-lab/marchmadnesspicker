package edu.guilford;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BracketPanel extends JPanel {

    private Bracket bracket;

    // storing all of our loaded teams
    private ArrayList<Team> allTeams;

    // panel to hold the regional buttons
    private JPanel regionButtonPanel;

    // panel that switches between regiona selection an torunament display
    private JPanel contentPanel;

    private JLabel[] regionStatusLabels;
    private String[] regions;

    // constructor to initialize the bracket panel with all regions
    public BracketPanel() {
        setLayout(new BorderLayout());

        // Load all teams from data importer
        allTeams = DataImporter.loadTeams();

        // Create bracket object with all teams
        bracket = new Bracket(allTeams);

        // Create title label
        JLabel title = new JLabel("March Madness Bracket Picker 2025-26", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 32));
        title.setOpaque(true);
        title.setBackground(new Color(30, 30, 30));
        title.setForeground(Color.WHITE);
        add(title, BorderLayout.NORTH);

        // Create content panel that will switch between region selection , tournament display, and champion display
        contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        add(contentPanel, BorderLayout.CENTER);

        // Show the region selection view
        showRegionSelection();
    }

    // displaying the 4 regional buttons for tournament selection
    private void showRegionSelection() {
        contentPanel.removeAll();

        // region button and a status label for each region
        // showing champion status directly on the main screen for easy reference
        regionButtonPanel = new JPanel();
        regionButtonPanel.setLayout(new GridLayout(4, 1, 15, 15));
        regionButtonPanel.setBackground(new Color(40, 40, 40));

        // Create panel for region buttons - 2x2 grid
        regionButtonPanel = new JPanel();
        regionButtonPanel.setLayout(new GridLayout(2, 2, 15, 15));
        regionButtonPanel.setBackground(new Color(40, 40, 40));

        // Define regions and their colors for visual appeal
        regions = new String[] { "EAST", "WEST", "SOUTH", "MIDWEST" };
        Color[] regionColors = {
                new Color(50, 50, 200), // blue for East
                new Color(200, 50, 50), // red for West
                new Color(255, 165, 0), // orange for South
                new Color(200, 150, 50) // Gold for Midwest
        };

        // Initialize status labels for each region
        regionStatusLabels = new JLabel[regions.length];

        // Create a button for each region
        for (int i = 0; i < regions.length; i++) {
            String region = regions[i];
            Color regionColor = regionColors[i];

            // holding our button and status label for each region in a sub-panel for better layout control
            // declaring and isntantiating our JButton for the region and styling it with the region color and some basic formatting
            JPanel regionRowPanel = new JPanel(new BorderLayout(10,5));
            regionRowPanel.setBackground(new Color(40, 40, 40));

            JButton regionButton = new JButton(region + " REGION");
            regionButton.setFont(new Font("Arial", Font.BOLD, 24));
            regionButton.setBackground(regionColor);
            regionButton.setForeground(Color.WHITE);
            regionButton.setFocusPainted(false);

            // our action listener to handle when a region button is clicked, launching the regional tournament for that region (4)
            regionButton.addActionListener(e -> {
                startRegionalTournament(region);
            });

            // create status label showing regional champion if selected, or "no champion selected" if not
            // appearing below each region button for easy reference on the main screen
            // starts of gray and italic and turns green and bold when a champion is selected for that region
            // connecting the lisener from above to update the status label when a champion is selected in the regional tournament panel
            JLabel statusLabel = new JLabel("No champion selected", JLabel.CENTER);
            statusLabel.setFont(new Font("Arial", Font.ITALIC, 14));
            statusLabel.setForeground(Color.LIGHT_GRAY);
            statusLabel.setOpaque(true);
            statusLabel.setBackground(new Color(40, 40, 40));
            statusLabel.setForeground (Color.LIGHT_GRAY);
            regionStatusLabels[i] = statusLabel;

            regionRowPanel.add(regionButton, BorderLayout.CENTER);
            regionRowPanel.add(statusLabel, BorderLayout.SOUTH);

            updateRegionStatus(i); // initialize status label
            // adding the button and status label for this region to the main region button panel
            regionButtonPanel.add(regionRowPanel);
        }
        contentPanel.add(regionButtonPanel, BorderLayout.CENTER);

            // Add a subtitle
        JLabel subtitle = new JLabel("Select a Region to Begin", JLabel.CENTER);
        subtitle.setFont(new Font("Arial", Font.PLAIN, 18));
        subtitle.setOpaque(true);
        subtitle.setBackground(new Color(60, 60, 60));
        subtitle.setForeground(Color.WHITE);
        contentPanel.add(subtitle, BorderLayout.SOUTH);
        
        contentPanel.revalidate();
        contentPanel.repaint();
    }

    // updating the status label for a region when a champion is selected for that region
    // if champion exists show champion name and seed, if not show "no champion selected"
    public void updateRegionStatus( int regionIndex) {
        if (regionStatusLabels == null || regionIndex < 0 || regionIndex >= regionStatusLabels.length) {
            return; // safety check
        }
        String region = regions[regionIndex];
        Team champion = bracket.getRegionalChampion(region);
        JLabel statusLabel = regionStatusLabels[regionIndex];
        if (champion != null) {
            statusLabel.setText(champion.getName() + " (Seed: " + champion.getSeed() + ")");
        } else {
            statusLabel.setText("No champion selected");
        }
    }

    // starting the tournament for a specific region
    private void startRegionalTournament(String region) {
        // Filter teams by region
        ArrayList<Team> regionTeams = new ArrayList<>();
        for (Team team : allTeams) {
            if (team.getRegion().equals(region)) {
                regionTeams.add(team);
            }
        }
        
        // Launch the tournament view for this region
        RegionalTournamentPanel reginalPanel = new RegionalTournamentPanel(
            region, 
            regionTeams, 
            bracket, 
            this
        );
        
        contentPanel.removeAll();
        contentPanel.add(reginalPanel, BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }

    // when region tournament is complete, this method is called to update the bracket with the regional champion
    // returns to main region selection view 

     public void onRegionComplete(Team regionWinner) {
        // Add region winner to Final Four
        bracket.advanceToFinal4(regionWinner);

        bracket.setRegionalChampion(regionWinner.getRegion(), regionWinner); // store regional champion in bracket for easy access on main screen
        
        // Check if all 4 regions are complete
        if (bracket.getFinal4().size() == 4) {
            launchFinalFour();
        } else {
            // Return to region selection
            showRegionSelection();
        }
    }



    // launching final four method 
    // when all 4 regions are complete, 
    // this method is called to display the final four matchups and allow the user to pick the champion

     private void launchFinalFour() {
        FinalFourPanel finalFourPanel = new FinalFourPanel(
            bracket.getFinal4(),
            bracket,
            this );
        
        contentPanel.removeAll();
        contentPanel.add(finalFourPanel, BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }

    // tournament champion has been selected
    // display the champion and offer to restart 
    public void onTournamentComplete(Team champion) {
        contentPanel.removeAll();
        
        JPanel championPanel = new JPanel();
        championPanel.setLayout(new BorderLayout());
        championPanel.setBackground(new Color(30, 30, 30));
        
        // Display champion information
        JLabel championLabel = new JLabel(" CHAMPION ", JLabel.CENTER);
        championLabel.setFont(new Font("Arial", Font.BOLD, 36));
        championLabel.setForeground(Color.YELLOW);
        championPanel.add(championLabel, BorderLayout.NORTH);
        
        JLabel championName = new JLabel(champion.getName(), JLabel.CENTER);
        championName.setFont(new Font("Arial", Font.BOLD, 28));
        championName.setForeground(Color.WHITE);
        championPanel.add(championName, BorderLayout.CENTER);
        
        JLabel championInfo = new JLabel(champion.getFullInfo().replace("\n", "<br>"), JLabel.CENTER);
        championInfo.setFont(new Font("Arial", Font.PLAIN, 14));
        championInfo.setForeground(Color.LIGHT_GRAY);
       // championPanel.add(championInfo, BorderLayout.SOUTH);
        
        // Add restart button
        JButton restartButton = new JButton("New Bracket");
        restartButton.setFont(new Font("Arial", Font.PLAIN, 16));
        restartButton.addActionListener(e -> {
           
            // Clear bracket and reset
            bracket = new Bracket(allTeams);
            showRegionSelection();
        });
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(30, 30, 30));
        buttonPanel.add(restartButton);
       
       JPanel bottomPanel = new JPanel(new BorderLayout());
       bottomPanel.setBackground(new Color(30, 30, 30));
       bottomPanel.add(championInfo, BorderLayout.CENTER);
         bottomPanel.add(buttonPanel, BorderLayout.SOUTH);
        
        contentPanel.add(championPanel, BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }

}
