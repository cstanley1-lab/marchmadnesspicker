package edu.guilford;

import java.util.ArrayList;

public class DataImporter {
// importating the data for all 64 teams into an arraylist organized by region 
    // each region has 16 teams

     public static ArrayList<Team> loadTeams() {
        ArrayList<Team> teams = new ArrayList<>();
 

        // EAST REGION - SEEDS 1-16 ( Completed )
        // Duke, UConn, Michigan State,Kansas,St Johns,Louisville,Ucla
        // Ohio state,Tcu, ucf, south florida,northern iowa, cal baptist
        //north dakotat state,Furman, Siena 
        
        
        teams.add(new Team("Duke", 1, "EAST", "Jon Scheyer", 30, 2, 
                81.6, 63.6, 128.1, 90.7, 37.7, 56.7, 13.4, 57.9,
                "Fast-paced offense, interior domination", "Spacing and tempo", 
                "Cameron Boozer, Isiah Evans", "120-50", "11-4"));
        
        teams.add(new Team("Uconn", 2, "EAST", "Dan Hurley", 28, 4,
                76.6, 65.2, 122.6, 92.8, 29.78, 54.3, 13.9, 53.9,
                "Ball movement, and off ball movement", "Bend dont break",
                "Solo Ball, Tarris Reed Jr.", "77-34", "20-5"));
        
        teams.add(new Team("Michigan State", 3, "EAST", "Tom Izzo", 26, 6,
                78.8, 68.3, 123.1, 95.4, 28.76, 53.8, 13.3, 80.8,
                "Crash the paint and class", "Traditional offensse, point gaurd leads",
                "Jeremy Fears, Coen Carr", "77-36", "59-26"));
      
        teams.add(new Team("Kansas", 4, "EAST", "Bill Self", 23, 9,
                80.9, 69.6, 121.1, 93.9, 27.17, 51.1, 16.6, 73.4,
                "Spread the floor", "Get movement and spacing and close the floor defensively",
                "Darryn Peterson, Flory Bidunga", "118-52", "58-25"));
        
        teams.add(new Team("St Johns", 5, "EAST", "Rick Pitino", 26, 6,
                75.2, 69.1, 113.8, 102.1, 11.7, 52.8, 15.2, 48.5,
                "Balanced approach", "3-and-D philosophy",
                "Zuby Ejiofor, Bryce Hopkins", "30-34", "55-23"));
       
        teams.add(new Team("Louisville", 6, "EAST", "Pat Kelsey", 22, 10,
                84.3, 72.5, 123.5, 98.9, 24.57, 56.5, 14.6, 74.8,
                "Defensive pressure, transition", "Tough defense",
                "Mikel Brown Jr., Ryan Conwell", "75-41", "0-5"));
        
        teams.add(new Team("UCLA", 7, "EAST", "Mick Cronin", 22, 10,
                77.1, 71.1, 122.8, 101.6, 21.19, 53.4, 15.8, 68.7,
                "Transition buckets and quick shots", "West Coast speed",
                "Donavan Dent, Skyy Clark", "11-43", "17-16"));
        
        teams.add(new Team("Ohio state", 8, "EAST", "Jake Diebler", 21, 11,
                79.3, 72.6, 124.0, 101.8, 22.22, 56.2, 13.5, 71.5,
                " chaos", "Defensive suffocation",
                "Bruce Thornton, John Mobley Jr.", "58-35", "0-1"));
       
        teams.add(new Team("TCU", 9, "EAST", "Jamie Dixon", 24, 10,
                77.4, 72.1, 115.0, 97.7, 17.35, 50.4, 17.2, 73.2,
                "Take the right shots", "Dont lose balance",
                "Tanner Toolson, Brock Harding", "8-12", "15-16"));
      
        teams.add(new Team("UCF", 10, "EAST", "Johnny Dawkins", 21, 11,
                80.7, 78.4, 120.0, 105.0, 14.97, 52.6, 13.7, 72.9,
                "Length and athleticism", "Hustle and grind",
                "Carmelo Pacheco, John Bol", "0-6", "3-3"));
       
        teams.add(new Team("South Florida", 11, "EAST", "Chris Mack", 24, 8,
                86.8, 76.5, 117.7, 100.8, 16.90, 50.6, 16.3, 70.9,
                "Score through pace", "Coach for rhythm and energy",
                "Wes Enis, Izaiyah Nelson", "2-4", "11-9"));
        
        teams.add(new Team("Northern Iowa", 12, "EAST", "Kyle Green", 20, 12,
                68.6, 62.5, 109.8, 98.9, 10.93, 53.8, 15.8, 75.2,
                "Slow and suffocating", "Grind and physically dominate",
                "Trey campbell, Leon Bond", "5-9", "N/A"));
        
        teams.add(new Team("Cal Baptist", 13, "EAST", "Kyle Getter", 24, 8,
                72.6, 67.6, 107.8, 101.7, 6.08, 48.3, 14.8, 74.4,
                "Mid-major scrappy", "Effort based",
                "Dominique Daniels Jr., Jonathan Griman", "0-0", "N/A"));
        
        teams.add(new Team("North Dakota State", 14, "EAST", "David Richman", 25, 7,
                78.7, 71.4, 111.6, 107.0, 4.5, 53.2, 16.6, 76.6,
                "Crash the glass", "Max out opportunities",
                "Damari Wheeler-Thomas, Riley Massey", "2-5", "1-3"));
       
        teams.add(new Team("Furman", 15, "EAST", "Bob Richey", 20, 12,
                74.9, 72.5, 108.2, 109.6, -1.42, 54.8, 11.8, 73.6,
                "5 out", "Move and shoot",
                "Tom House, Ben Vander Wal", "2-9", "1-2"));
        
        teams.add(new Team("Siena", 16, "EAST", "Nevada Smith", 21, 11,
                70.4, 65.8, 107.8, 108.9, -1.04, 50.4, 14.7, 71.5,
                "Mismatch hunt", "Inside outside balance",
                "Gavin Doty, Justice Shoats", "4-7", "N/A"));
 
        
        // WEST REGION - SEEDS 1-16
        // west region if filled and updated
        
        teams.add(new Team("Arizona", 1, "WEST", "Tommy Lloyd", 30, 2,
                86.2, 69.4, 128.1, 90.0, 38.06, 54.7, 14.2, 75.6,
                "Dominate the interior", "Physicality and toughness",
                "Koa Peat, Brayden Burries", "66-39", "10-5"));
        
        teams.add(new Team("Purdue", 2, "WEST", "Matt Painter", 24, 8,
                81.6, 70.5, 131.6, 100.5, 31.08, 57.6, 13.5, 74.3,
                "Guard driven, screen and roll", "Run through our engine",
                "Braden Smith, Trey Kaufman-Renn", "54-37", "24-17"));
   
        teams.add(new Team("Gonzaga", 3, "WEST", "Mark Few", 29, 3,
                84.3, 66.2, 121.1, 94.1, 26.98, 55.6, 17.6, 76.3,
                "Balanced, resilient", "Defensive toughness",
                "Graham Ike, Braden Huff", "48-28", "45-26"));
        
        teams.add(new Team("Arkansas", 4, "WEST", "John Calipari", 24, 8,
                90.2, 81.0, 127.9, 102.4, 25.47, 56.4, 13.5, 70.8,
                "Half-court offensive sets", "Rely on guard play",
                "Darius Accuff Jr., Maleek Thomas", "54-37", "60-23"));

        teams.add(new Team("Wisconsin", 5, "WEST", "Greg Gard", 22, 10,
                83.0, 76.1, 125.2, 102.1, 23.09, 54.5, 12.5, 73.4,
                "Fluent offense", "We are the underdogs",
                "Nick Boyd, Austin Rapp", "41-28", "7-8"));
       
        teams.add(new Team("BYU", 6, "WEST", "Kevin Young", 260, 12,
                83.5, 75.4, 125.1, 102.3, 22.78, 54.4, 14.2, 73.3,
                "Efficient offense", "Ball movement",
                "AJ Dybansta, Robert Wright III", "17-35", "2-2"));
        // Miami filled and completed
        teams.add(new Team("Miami (FL)", 7, "WEST", "Jai Lucas", 24, 8,
                81.5, 71.3, 121.0, 100.4, 20.64, 55.3, 16.1, 76.3,
                "Uptempo, transition", "Athlete development",
                "Tre Donaldson, Ernest Udeh Jr.", "12-11", "0-0"));
        
        teams.add(new Team("Villanova", 8, "WEST", "Kevin Willard", 24, 8,
                77.1, 71.2, 120.7, 100.8, 19.92, 53.8, 16.0, 69.9,
                "Defensive focus, grinding", "Team defense",
                "Acaden Lewis, Devin Askew", "71-40", "4-8"));
        
        teams.add(new Team("Utah State", 9, "WEST", "Ben Jacobson ", 26, 6,
                81.4, 71.2, 123.0, 101.5, 21.53, 56.3, 17.4, 69.4,
                "Execution, fundamentals", "Coaching",
                "Mason Falslev, Karson Templin", "8-27", "4-5"));
       
        teams.add(new Team("Missouri", 10, "WEST", "Dennis Gates", 20, 12,
                79.2, 75.5, 119.2, 97.2, 14.93, 55.1, 14.2, 71.0,
                "Get to the hole", "Energy",
                "Mark Mitchell, Aaron Rowe", "23-30", "1-4"));
        
        teams.add(new Team("Texas", 11, "WEST", "Sean Miller", 18, 14,
                81.8, 76.1, 124.9, 104.4, 20.57, 54.1, 11.5, 76.3,
                "Iso ball", "Feed the hot hand",
                "Jordan Pope, Tramon Mark", "40-42", "25-14"));
        
        teams.add(new Team("High Point", 12, "WEST", "Flynn Clayman", 28, 4,
                86.4, 72.8, 117.5, 107.9, 9.52, 54.5, 18.4, 70.7,
                "High intensity", "Outscore not outdefend",
                "Rob Martin, Terry Anderson", "1-2", "N/A"));
        
        teams.add(new Team("Hawai'i", 13, "WEST", "Eran Ganot", 24, 8,
                78.7, 71.2, 107.2, 101.6, 5.58, 52.0, 14.9, 76.7,
                "Crash the glass and create opportunities", "Everyone rebounds",
                "Isaac Johnson, Hunter Erickson", "1-6", "N/A"));
        
        teams.add(new Team("Kennesaw State", 14, "WEST", "Antoine Pettway", 19, 13,
                80.0, 78.3, 110.7, 117.6, 1.19, 50.4, 13.9, 72.4,
                "Balance", "Operate with discipline",
                "RJ Johnson, Simeon Cottle", "0-2", "N/A"));
       
        teams.add(new Team("Queens (NC)", 15, "WEST", "Grant Leonard", 19, 13,
                84.4, 83.8, 115.8, 117.6, -1.77, 56.4, 13.0, 69.3,
                "OFfense Offesnse Offense", "Dont worry about defense",
                "Nasir Mann, Chris Ashby", "0-0", "N/A"));
        
        teams.add(new Team("Long Island", 16, "WEST", "Rod Strickland", 22, 10,
                73.6, 71.7, 105.7, 109.7, -3.99, 52.8, 16.2, 69.8,
                "Everyone eats", "Team building",
                "Jamal Fuller, Malachi Davis", "0-8", "N/A"));
 
        // SOUTH REGION - SEEDS 1-16
        // completed and updated
       
        
        teams.add(new Team("Florida", 1, "SOUTH", "Todd Golden", 25, 7,
                87.1, 71.5, 126.1, 92.4, 33.57, 54.2, 13.5, 77.9,
                "Play vertical and shoot", "Feed the bigs",
                "Boogie Fland, Thomas Haugh", "51-20", "7-3"));
        
        teams.add(new Team("Houston", 2, "SOUTH", "Kelvin Sampson", 26, 6,
                76.8, 62.3, 124.7, 90.8, 33.84, 51.9, 17.7, 72.8,
                "Attack and defend", "Defense and depth",
                "Kingston Flemings, Emmanual Sharp", "47-32", "31-22"));
       
        teams.add(new Team("Illinois", 3, "SOUTH", "Brad Underwood", 25, 7,
                83.2, 68.8, 131.2, 97.5, 33.67, 54.7, 10.1, 74.6,
                "Eurocentric playstyle", "Pass and play big",
                "Tomislav Ivisic, Keaton Wagler", "50-36", "12-10"));
        
        teams.add(new Team("Nebraska", 4, "SOUTH", "Fred Hoiberg", 26, 6,
                77.1, 66.2, 119.5, 93.0, 26.58, 55.5, 16.6, 74.6,
                "Defensive juggernaut", "Defensive intensity",
                "Sam Hoiberg, Pryce Sandfort", "0-7", "3-5"));
       
        teams.add(new Team("Vanderbilt", 5, "SOUTH", "Mark Byington", 24, 8,
                85.8, 75.5, 127.1, 99.8, 27.35, 55.3, 15.3, 71.6,
                "Play through adversity", "Adapt and overcome",
                "Tyler Tanner, Jalen Washington", "10-18", "1-2"));
        
        teams.add(new Team("North Carolina", 6, "SOUTH", "Hubert Davis", 274, 8,
                79.7, 71.1, 120.8, 100.5, 20.11, 54.3, 11.8, 75.6,
                "Attack the glass or shoot the 3", "Switch everything",
                "Seth Trimble, Henri Veesar", "134-52", "6-3"));
      
        teams.add(new Team("Saint Mary's", 7, "SOUTH", "Mickey McConnell ", 27, 5,
                76.8, 65.2, 119.2, 97.3, 21.87, 52.8, 13.5, 78.7,
                "Rebound and kick out", "Consistency and efficiency",
                "Augustas Marciulionis, Alex Ducas", "8-15", "0-0"));
        
        teams.add(new Team("Clemson", 8, "SOUTH", "Brad Brownell", 22, 10,
                73.8, 66.7, 116.5, 98.0, 18.61, 52.6, 15.3, 75.3,
                "Grit and grind", "Tournament experience",
                "Dillon Hunter, Nick Davidson", "14-15", "6-9"));
       
        teams.add(new Team("Iowa", 9, "SOUTH", "Ben McCollum", 20, 12,
                74.5, 66.3, 123.7, 93.5, 23.39, 56.4, 17.9, 73.0,
                "Move the ball and create opportunities", "Slow the game down",
                "Bennett Stirtz, Tavion Banks", "34-32", "4-2"));
       
        teams.add(new Team("Texas A&M", 10, "SOUTH", "Bucky McMillan", 21, 13,
                86.1, 78.9, 119.4, 100.7, 18.69, 53.8, 15.7, 68.4,
                "Mid-major solid", "Cinderella appeal",
                "Zach Clemson, Ruben Dominguez", "15-18", "0-1"));
      
        teams.add(new Team("VCU", 11, "SOUTH", "Phil Martelli Jr.", 25, 7,
        80.8, 71.8, 119.2, 101.8, 17.44, 53.6, 14.8, 73.2,
                "Speed and Skill", "We are the underdog",
                "Terrance Hill jr , Christian Fermin", "14-21", "0-1"));
        
        teams.add(new Team("McNeese", 12, "SOUTH", "Bill Armstrong", 27, 5,
                76.5, 67.4, 114.5, 102.0, 12.49, 50.7, 20.9, 68.4,
                "Mid-American Conference", "Offensive creativity",
                "Larry Johnson, Jerell Colbert", "20-100", "N/A"));

        teams.add(new Team("Troy", 13, "SOUTH", "Adam Howard", 21, 11,
                77.3, 74.5, 110.4, 109.2, 1.16, 51.5, 14.3, 69.9,
                "Everyone eats", "Balance",
                "Cobi Campbell, Jerell Bellamy", "0-4", "2-1"));
        
        teams.add(new Team("UPenn", 14, "SOUTH", "Fran McCaffery", 18, 12,
                74.4, 74.5, 107.6, 106.6, 0.99, 50.4, 14.9, 70.4,
                "Move and space", "Rebuilding",
                "Tj Power, Aj Levine", "13-27", "6-13"));
        
        teams.add(new Team("Idaho", 15, "SOUTH", "Alex Pribble", 18, 14,
                75.8, 74.1, 108.4, 107.4, 1.0, 51.4, 13.4, 78.3,
                "Crash the glass", "Make the most out of everything",
                "Kolton Mitchell, Seth Joba", "1-5", "N/A"));
        
        teams.add(new Team("Prairie View A&M", 16, "SOUTH", "Byron Smith", 15, 17,
                74.8, 78.9, 101.2, 111.4, -10.15, 47.4, 16.2, 66.1,
                "Get it out the mud", "Team building",
                "Jordan Tillmon, Braelon Bush", "1-3", "1-2"));
 
        
        // MIDWEST REGION - SEEDS 1-16
        
        
        teams.add(new Team("Michigan", 1, "MIDWEST", "Dusty May", 30, 2,
                87.3, 69.5, 128.2, 88.5, 39.70, 58.3, 13.1, 74.5,
                "Attack the basket", "Out physical the other team",
                "Yaxel Lendenborg, Elliot Cadeau", "74-31", "12-3"));
        
        teams.add(new Team("Iowa State", 2, "MIDWEST", "Tj Otzelberger", 27, 5,
                82.0, 65.6, 123.6, 91.6, 32.00, 56.1, 19.8, 72.9,
                "3 and d", "Spread the floor and play defense",
                "Joshua Jefferson, Milan Momcilovic", "24-24", "5-5"));
        
        teams.add(new Team("Virginia", 3, "MIDWEST", "Ryan Odom", 27, 5,
                80.4, 68.8, 122.8, 97.1, 25.71, 54.6, 13.3, 73.5,
                "Spread the floor and suffocate on defense", "Slow and steady",
                "Chance Mallory, Thijs De Ridder", "35-25", "2-4"));
        
        teams.add(new Team("Alabama", 4, "MIDWEST", "Nate Oats", 24, 8,
                91.2, 82.7, 129.7, 102.5, 27.22, 55.2, 10.8, 69.7,
                "Score and score", "Maximize offense",
                "Labaron Philon, Aden Halloway", "33-26", "15-9"));
        
        teams.add(new Team("Texas Tech", 5, "MIDWEST", "Grant MsCasland", 23, 9,
                80.2, 73.1, 124.8, 100.4, 24.46, 56.1, 12.7, 71.1,
                "3 ball ", "Bend dont break",
                "Christian Anderson jr. , LeJuan Watts", "22-22", "5-4"));
        
        teams.add(new Team("Tennessee", 6, "MIDWEST", "Rick Barnes", 22, 10,
                78.8, 69.6, 121.4, 94.4, 27.0, 51.4, 14.1, 75.5,
                "Physical", "Defense",
                "Nate Ament, Ja'kobi Gillespie", "70-90", "36-20"));
        
        teams.add(new Team("Kentucky", 7, "MIDWEST", "Mark Pope", 20, 12,
                80.5, 74.3, 120.4, 99.3, 21.09, 53.3, 13.4, 71.8,
                "Keep shooting", "SEC competitive",
                "Otega Oweh, Collin Chandler", "134-57", "3-4"));
        
        teams.add(new Team("Georgia", 8, "MIDWEST", "Mike White", 23, 9,
                89.4, 79.8, 124.1, 104.8, 19.36, 54.2, 15.6, 67.7,
                "3 level scoring ", "Score by any means necessary",
                "kanon Catchings, Blue Cain", "7-14", "6-7"));
        
        teams.add(new Team("Saint Louis", 9, "MIDWEST", "Josh Schertz", 28, 4,
                86.4, 71.6, 120.3, 100.8, 19.51, 59.7, 13.9, 74.6,
                "Heliocentric offense", "Keep the engine going",
                "Robbie Avila, Trey Green", "7-12", "N/A"));
        
        teams.add(new Team("Santa Clara", 10, "MIDWEST", "Herb Sendek", 25, 7,
                82.9, 73.5, 123.7, 104.7, 19.02, 54.4, 17.2, 69.5,
                "High shots", "Score as much as possible",
                "Allen Graves, Brenton knapper", "11-14", "7-9"));
        
        teams.add(new Team("Miami (OH)", 11, "MIDWEST", "Travis Steele", 32, 0,
                86.3, 76.5, 117.1, 108.5, 8.64, 58.6, 15.2, 73.2,
                "3 ball efficiency", "Mid-major potential and unpredictability",
                "Eian Elmer, Brant Byers", "7-20", "0-0"));
        
        teams.add(new Team("Akron", 12, "MIDWEST", "Dustin Ford", 27, 5,
                86.4, 75.0, 118.9, 106.9, 11.94, 58.2, 15.9, 72.5,
                "Drive and kick", "Give space to each other",
                "Tavari Johnson, Amani Lyles", "0-7", "4-7"));
        
        teams.add(new Team("Hofstra", 13, "MIDWEST", "Speedy Claxton", 22, 10,
                79.8, 75.6, 112.6, 110.2, 9.06, 51.4, 12.8, 71.5,
                "dont get down ", "Scrappy play",
                "Cruz Davis, Prestib Edmead", "0-10", "N/A"));
        
        teams.add(new Team("Wright State", 14, "MIDWEST", "Clin Sargent", 21, 11,
                68.2, 76.2, 105.5, 110.2, 2.36, 44.1, 14.6, 72.6,
                "competitive", "Mid-major grind",
                "Micheal Cooper, TJ Burch", "1-5", "0-2"));
        
        teams.add(new Team("Tennessee State", 15, "MIDWEST", "Nolan Smith", 23, 9,
                77.9, 75.1, 109.2, 111.3, -2.05, 50.0, 17.3, 72.1,
                "physical", "Tournament spirit",
                "Travis harper II, Alex Garcia", "0-3", "0-0"));
        
        teams.add(new Team("Howard", 16, "MIDWEST", "Kenny Blakeney", 22, 10,
                75.5, 69.4, 104.9, 107.5, -2.64, 50.9, 17.9, 71.6,
                "Shoot when open", "Building block",
                "Bryce Harris, Cam Gillus", "1-5", "1-3"));
 
        return teams;
    }

}
