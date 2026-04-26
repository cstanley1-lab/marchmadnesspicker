package edu.guilford;

import javax.swing.JFrame;

public class marchmadnessdriver {

    // this is the main driver for our march madness bracket predictor

    public static void main (String[] args) {

        // creating our main window with Jframe

        JFrame frame = new JFrame ("March Madness Bracket Predictor");

        // setting the size of our window
        frame.setSize(1200,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        

        BracketPanel mainPanel = new BracketPanel();
        frame.add(mainPanel);
        frame.setVisible(true);
    }

}
