package edu.guilford;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class regionStatusLabels {
    private JLabel[] statusLabels; // array to hold the labels for each region
    private String[] regions;
    private boolean[] regionComplete;

    public regionStatusLabels( String[] regions) {
        // this class will manage the labels that show the status of each region on the main screen
        // will update to show which team is currently the champion of each region as the user picks winners
       
        this.regions = regions;
        this.statusLabels = new JLabel[regions.length];
        this.regionComplete = new boolean[regions.length];

        // Initialize labels for each region
        for (int i = 0; i < regions.length; i++) {
            JLabel label = new JLabel("No champion selected", JLabel.CENTER);
            label.setFont(new Font("Arial", Font.ITALIC, 14));
            label.setForeground(Color.LIGHT_GRAY);
            label.setOpaque(true);
            label.setBackground(new Color(40, 40, 40));
            statusLabels[i] = label;
            regionComplete[i] = false;
        }



    }

    public JLabel getLabel(int index) {
         if (index >= 0 && index < statusLabels.length) {
            return statusLabels[index];
        }
        return null;
    }

    public void updateRegionStatus(int regionIndex, Team champion) {
         if (regionIndex < 0 || regionIndex >= statusLabels.length) {
            return;
        }
        
        JLabel label = statusLabels[regionIndex];
        
        if (champion != null) {
            label.setText(champion.getName() + " (Seed: " + champion.getSeed() + ")");
            label.setFont(new Font("Arial", Font.BOLD, 14));
            label.setForeground(Color.GREEN);  // Highlight completed regions
            regionComplete[regionIndex] = true;
        } else {
            label.setText("No champion selected");
            label.setFont(new Font("Arial", Font.ITALIC, 14));
            label.setForeground(Color.LIGHT_GRAY);
            regionComplete[regionIndex] = false;
        }
    }
     // Check if all regions are complete (useful for triggering Final Four)
    public boolean allRegionsComplete() {
        for (boolean complete : regionComplete) {
            if (!complete) return false;
        }
        return true;
    }
    
    // Get count of completed regions
    public int getCompletedRegionCount() {
        int count = 0;
        for (boolean complete : regionComplete) {
            if (complete) count++;
        }
        return count;
    }
    
    // Reset all labels (for "New Bracket" functionality)
    public void resetAll() {
        for (int i = 0; i < regions.length; i++) {
            updateRegionStatus(i, null);
        }
    }
    
    // Get region name by index
    public String getRegionName(int index) {
        if (index >= 0 && index < regions.length) {
            return regions[index];
        }
        return null;
    }


}
