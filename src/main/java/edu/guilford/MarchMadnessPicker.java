package edu.guilford;

import javax.swing.JFrame;

public class MarchMadnessPicker {
    public static void main(String[] args) {
       // create the main window (Jframe)
       JFrame frame = new JFrame("March Madness Picker");

       frame.setSize(1200,800);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         frame.setResizable(false);

         // Main panel that will hold everything 
         BracketPanel mainPanel = new BracketPanel();

         // add the panel to the fram 
         frame.add(mainPanel);
         frame.setVisible(true);


    
    }
}