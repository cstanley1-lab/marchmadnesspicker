package edu.guilford;

import java.util.ArrayList;

public class DataImporter {
// importating the data for all 64 teams into an arraylist organized by region 
    // each region has 16 teams

     public static ArrayList<Team> loadTeams() {
        ArrayList<Team> teams = new ArrayList<>();
 

        // EAST REGION - SEEDS 1-16
        // Duke, UConn, Michigan State,Kansas,St Johns,Louisville,Ucla
        // Ohio state,Tcu, ucf, south florida,northern iowa, cal baptist
        //north dakotat state,Furman, Siena 
        
        // Duke stats updated and completed
        teams.add(new Team("Duke", 1, "EAST", "Jon Scheyer", 30, 2, 
                81.6, 63.6, 128.1, 90.7, 37.7, 56.7, 13.4, 57.9,
                "Fast-paced offense, interior domination", "Spacing and tempo", 
                "Cameron Boozer, Isiah Evans", "120-50", "11-4"));
        // UConn stats updated and completed
        teams.add(new Team("Uconn", 2, "EAST", "Dan Hurley", 28, 4,
                76.6, 65.2, 122.6, 92.8, 29.78, 54.3, 13.9, 53.9,
                "Ball movement, and off ball movement", "Bend dont break",
                "Solo Ball, Tarris Reed Jr.", "77-34", "20-5"));
        
        teams.add(new Team("Michigan State", 3, "EAST", "Tom Izzo", 27, 7,
                82.1, 67.3, 120.1, 100.5, 19.6, 56.1, 13.2, 51.5,
                "Elite scoring, transition game", "Uptempo offense",
                "Jaden Bradley, Mark Sears", "80-35", "8-2"));
        
        teams.add(new Team("Kansas", 4, "EAST", "Tommy Lloyd", 26, 8,
                76.5, 68.2, 115.3, 101.2, 14.1, 53.5, 14.1, 49.2,
                "Defensive minded, halfcourt", "Defensive intensity",
                "Jiolani Martin, Kylan Boswell", "60-40", "9-3"));
        
        teams.add(new Team("St Johns", 5, "EAST", "Shaka Smart", 25, 9,
                75.2, 69.1, 113.8, 102.1, 11.7, 52.8, 15.2, 48.5,
                "Balanced approach", "3-and-D philosophy",
                "Stevie Mitchell, Oso Ighoefe", "50-35", "7-5"));
        
        teams.add(new Team("Louisville", 6, "EAST", "Kelvin Sampson", 28, 6,
                74.3, 62.5, 112.5, 95.8, 16.7, 51.2, 12.8, 50.1,
                "Defensive pressure, transition", "Tough defense",
                "Jarace Walker, LJ Cryer", "65-45", "11-2"));
        
        teams.add(new Team("UCLA", 7, "EAST", "Brad Underwood", 27, 7,
                78.9, 67.8, 116.5, 100.2, 16.3, 54.6, 13.5, 51.8,
                "Inside-out game, balanced", "Player development",
                "Terrence Shannon Jr., Marcus Domask", "55-40", "6-4"));
        
        teams.add(new Team("Ohio state", 8, "EAST", "Darian DeVries", 25, 9,
                73.1, 70.2, 110.5, 103.8, 6.7, 50.1, 16.9, 47.2,
                "Press defense, chaos", "Defensive suffocation",
                "Javon Bennett, Quentin Millora-Brown", "40-50", "5-6"));
        
        teams.add(new Team("TCU", 9, "EAST", "Steve Pikiell", 24, 10,
                71.8, 71.5, 108.2, 104.5, 3.7, 48.9, 17.5, 46.8,
                "Grind-it-out defense", "Rebounding focus",
                "Ace Bailey, Tyson Acuff", "35-55", "3-7"));
        
        teams.add(new Team("UCF", 10, "EAST", "Ed Cooley", 23, 11,
                72.5, 72.3, 109.1, 105.2, 3.9, 49.2, 18.1, 45.9,
                "Perimeter focused", "3-point shooting",
                "Ed Cooley, Jayson Carter", "30-60", "2-8"));
        
        teams.add(new Team("South Florida", 11, "EAST", "Penny Hardaway", 22, 12,
                76.3, 73.1, 111.8, 106.5, 5.3, 51.5, 16.8, 48.2,
                "Athleticism, pace", "Transition basketball",
                "PJ Launching, Tyrese Martin", "25-65", "1-9"));
        
        teams.add(new Team("Northern Iowa", 12, "EAST", "Anthony Grant", 21, 13,
                74.2, 74.5, 110.1, 107.8, 2.3, 50.8, 17.5, 46.1,
                "Mid-range reliant", "Consistency",
                "Javon Bennett, Malachi Smith", "20-70", "0-10"));
        
        teams.add(new Team("Cal Baptist", 13, "EAST", "Hank Thorns", 24, 10,
                72.1, 75.2, 108.5, 109.1, -0.6, 49.1, 18.9, 44.5,
                "Mid-major scrappy", "Effort based",
                "Jalen Shackelford, KyrokeKyrie", "15-75", "N/A"));
        
        teams.add(new Team("North Dakota State", 14, "EAST", "Jeff Linder", 20, 14,
                70.5, 76.1, 106.8, 110.5, -3.7, 47.9, 19.2, 43.2,
                "Offensive struggle", "Defense",
                "Hunter Maldonado, Langston Pesz", "10-80", "N/A"));
        
        teams.add(new Team("Furman", 15, "EAST", "Kenny Jones", 18, 16,
                68.9, 78.5, 104.2, 112.8, -8.6, 45.2, 20.1, 41.1,
                "Mid-major struggles", "Limited resources",
                "Chris Forrest, TJ Madkins", "5-85", "N/A"));
        
        teams.add(new Team("Siena", 16, "EAST", "Dan Raymond", 19, 15,
                69.2, 79.1, 105.1, 114.2, -9.1, 46.1, 21.5, 40.5,
                "Patriot League champion", "League success",
                "Tamir Megahed, Cam Marshall", "0-90", "N/A"));
 
        // ============================
        // WEST REGION - SEEDS 1-16
        // ============================
        
        teams.add(new Team("Kansas", 1, "WEST", "Bill Self", 30, 4,
                80.5, 63.2, 119.8, 94.5, 25.3, 56.9, 11.2, 53.8,
                "Methodical offense, balance", "Experience and execution",
                "Hunter Dickinson, Dajuan Harris", "130-40", "25-5"));
        
        teams.add(new Team("Arizona State", 2, "WEST", "Bobby Hurley", 29, 5,
                81.2, 64.8, 120.2, 97.1, 23.1, 57.2, 12.5, 52.1,
                "Guard driven, 3-point heavy", "Offensive efficiency",
                "Alston Mason, Frankie Collins", "75-50", "8-4"));
        
        teams.add(new Team("Baylor", 3, "WEST", "Scott Drew", 26, 8,
                78.3, 66.5, 117.1, 99.8, 17.3, 54.8, 13.8, 50.5,
                "Balanced, resilient", "Defensive toughness",
                "VJ Edgecombe, Jalen Bridges", "100-45", "14-3"));
        
        teams.add(new Team("Gonzaga", 4, "WEST", "Mark Few", 27, 7,
                79.8, 65.3, 118.5, 98.2, 20.3, 55.6, 12.1, 51.9,
                "Half-court offensive sets", "Consistency",
                "Graham Ike, Nolan Kayo", "120-50", "22-8"));
        
        teams.add(new Team("Colorado State", 5, "WEST", "Niko Medved", 24, 10,
                75.1, 68.9, 114.2, 102.5, 11.7, 52.1, 14.9, 49.8,
                "Defensive minded", "Effort and energy",
                "Isaiah Stevens, David Roddy", "45-60", "9-6"));
        
        teams.add(new Team("Creighton", 6, "WEST", "Greg McDermott", 26, 8,
                77.5, 67.2, 116.3, 100.1, 16.2, 53.9, 13.2, 51.2,
                "Efficient offense", "Ball movement",
                "Trey Alexander, Ryan Kalkbrenner", "65-55", "7-5"));
        
        teams.add(new Team("SMU", 7, "WEST", "Rob Lanier", 25, 9,
                76.8, 69.1, 115.8, 101.9, 13.9, 52.8, 15.1, 50.1,
                "Uptempo, transition", "Athlete development",
                "Boopie Miller, Jahmal Mosley", "50-60", "5-7"));
        
        teams.add(new Team("Texas A&M", 8, "WEST", "Buzz Williams", 23, 11,
                74.2, 70.5, 112.5, 103.8, 8.7, 51.2, 16.8, 48.5,
                "Defensive focus, grinding", "Team defense",
                "Tyrece Radford, Henry Coleman", "35-70", "4-9"));
        
        teams.add(new Team("Saint Mary's", 9, "WEST", "Randy Bennett", 24, 10,
                73.5, 71.2, 111.8, 104.5, 7.3, 50.1, 17.2, 47.8,
                "Execution, fundamentals", "Coaching",
                "Logan Johnson, Matthias Tass", "40-65", "8-6"));
        
        teams.add(new Team("Wichita State", 10, "WEST", "Isaac Brown", 22, 12,
                72.1, 72.8, 110.2, 105.9, 4.3, 49.5, 18.5, 46.2,
                "Mid-major scrappy", "Energy",
                "Tyson Etienne, Jaykell Martin", "30-75", "N/A"));
        
        teams.add(new Team("South Dakota State", 11, "WEST", "Grant Illingworth", 21, 13,
                71.8, 73.5, 109.8, 106.8, 3.0, 48.9, 19.1, 45.1,
                "Summit League strong", "Consistency",
                "Mike Daum, Zach Borg", "25-80", "N/A"));
        
        teams.add(new Team("New Mexico", 12, "WEST", "Richard Pitino", 20, 14,
                70.5, 74.2, 108.5, 107.9, 0.6, 47.8, 19.8, 44.5,
                "Defensive pressure", "Rebounding",
                "Javon Bennett, Jamal Mashburn Jr", "20-85", "N/A"));
        
        teams.add(new Team("Montana State", 13, "WEST", "Danny Sprinkle", 22, 12,
                71.2, 75.1, 109.1, 109.2, -0.1, 48.5, 20.2, 43.8,
                "Big Sky Conference", "Pace control",
                "RJ Cole, Amin Adamu", "15-90", "N/A"));
        
        teams.add(new Team("Sacramento State", 14, "WEST", "David Patrick", 19, 15,
                69.8, 76.5, 107.2, 110.8, -3.6, 46.9, 21.1, 42.5,
                "Offensive struggles", "Defense",
                "Isaac Mattai, Chris Ando", "10-95", "N/A"));
        
        teams.add(new Team("Southern Utah", 15, "WEST", "Nick Robinson", 17, 17,
                68.5, 77.9, 105.8, 112.5, -6.7, 45.2, 21.9, 41.2,
                "Limited resources", "Effort",
                "Rudi Sola, Gime Gyampoh", "5-100", "N/A"));
        
        teams.add(new Team("Florida A&M", 16, "WEST", "Robert Tobin", 16, 18,
                67.2, 78.5, 103.5, 113.8, -10.3, 43.8, 23.2, 39.1,
                "MEAC Conference", "Team building",
                "Antonio Daye Jr., Juwon Lemons", "0-105", "N/A"));
 
        // ============================
        // SOUTH REGION - SEEDS 1-16
        // ============================
        
        teams.add(new Team("Auburn", 1, "SOUTH", "Tony Barbee", 31, 3,
                83.4, 62.5, 122.1, 93.2, 28.9, 58.2, 10.5, 54.9,
                "Elite scoring, three-point dominant", "Offensive explosion",
                "Johni Broome, Jalin Williams", "140-35", "12-2"));
        
        teams.add(new Team("Tennessee", 2, "SOUTH", "Rick Barnes", 29, 5,
                81.8, 63.9, 119.5, 96.1, 23.4, 56.8, 11.8, 53.2,
                "Balanced attack", "Defense and depth",
                "Santiago Vescovi, Zakai Zeigler", "125-45", "11-4"));
        
        teams.add(new Team("Miami", 3, "SOUTH", "Jim Larranaga", 27, 7,
                78.2, 65.8, 117.2, 99.5, 17.7, 54.1, 13.5, 50.8,
                "Guard heavy, transition", "Recruiting and development",
                "Zach King, Nijemachi Njeuland", "90-50", "7-3"));
        
        teams.add(new Team("Texas Tech", 4, "SOUTH", "Mark Adams", 26, 8,
                76.1, 67.2, 114.5, 100.8, 13.7, 52.5, 14.2, 48.9,
                "Defensive juggernaut", "Defensive intensity",
                "De'Vion Harmon, Tyson Jolly", "85-60", "9-5"));
        
        teams.add(new Team("Clemson", 5, "SOUTH", "Brad Brownell", 25, 9,
                74.8, 68.5, 112.8, 101.9, 10.9, 51.2, 15.1, 49.2,
                "ACC balanced", "Coaching stability",
                "Chase Hunter, Ian Schieffelin", "75-70", "8-4"));
        
        teams.add(new Team("Michigan State", 6, "SOUTH", "Tom Izzo", 27, 7,
                77.5, 66.1, 115.9, 98.5, 17.4, 53.8, 12.9, 52.1,
                "Experienced, physical", "Defense and tournaments",
                "Jaden Akins, Malik Hall", "130-50", "22-8"));
        
        teams.add(new Team("Stanford", 7, "SOUTH", "Jerod Haase", 24, 10,
                73.5, 69.8, 111.2, 102.8, 8.4, 50.9, 16.2, 47.5,
                "Balanced, Stanford education", "Consistency and efficiency",
                "Austin Parker, Kerr Kriisa", "55-70", "6-8"));
        
        teams.add(new Team("Cincinnati", 8, "SOUTH", "Wes Miller", 23, 11,
                72.8, 70.5, 110.5, 103.9, 6.6, 49.8, 17.1, 46.8,
                "American Athletic strong", "Tournament experience",
                "Landers Nolley II, Javel Dean", "45-80", "5-9"));
        
        teams.add(new Team("Pepperdine", 9, "SOUTH", "Lamont Smith", 22, 12,
                71.5, 71.9, 109.1, 104.8, 4.3, 48.5, 18.3, 45.2,
                "West Coast small ball", "Development",
                "Darius Washington, Devin Jordan", "35-85", "N/A"));
        
        teams.add(new Team("Butler", 10, "SOUTH", "LaVall Jordan", 21, 13,
                70.2, 73.2, 107.8, 106.5, 1.3, 47.2, 19.5, 44.1,
                "Mid-major solid", "Cinderella appeal",
                "Jayden Aidoo, Langston Pesz", "30-90", "N/A"));
        
        teams.add(new Team("UT San Antonio", 11, "SOUTH", "Steve Henson", 20, 14,
                69.8, 74.1, 106.9, 107.8, -0.9, 46.8, 20.1, 43.5,
                "Conference USA strong", "Defensive grind",
                "Jhivvan Jackson, JP Moorman", "25-95", "N/A"));
        
        teams.add(new Team("Western Kentucky", 12, "SOUTH", "Rick Stansbury", 19, 15,
                68.5, 75.2, 105.5, 108.9, -3.4, 45.5, 20.8, 42.2,
                "Mid-American Conference", "Offensive creativity",
                "Nathan Lighton, Jake Stephens", "20-100", "N/A"));
        
        teams.add(new Team("Kennesaw State", 13, "SOUTH", "Afiee Bryant", 21, 13,
                70.1, 76.1, 106.8, 110.1, -3.3, 46.2, 21.5, 41.8,
                "Atlantic Sun challenger", "Upset potential",
                "Jason Bostic, Javon Clark", "15-105", "N/A"));
        
        teams.add(new Team("South Alabama", 14, "SOUTH", "Tony Delk", 20, 14,
                69.2, 77.2, 105.9, 111.5, -5.6, 44.9, 22.1, 40.5,
                "SunBelt fight", "Rebuilding",
                "Jamal Sheppard, John Petty Jr.", "10-110", "N/A"));
        
        teams.add(new Team("Nicholls State", 15, "SOUTH", "Tom Burrell", 18, 16,
                68.1, 78.5, 104.5, 112.8, -8.3, 43.2, 22.8, 39.1,
                "Southland Conference", "Limited resources",
                "Jaelyn Toles, David Camren Jackson", "5-115", "N/A"));
        
        teams.add(new Team("Omaha", 16, "SOUTH", "Ryan Jacobson", 16, 18,
                66.8, 79.8, 102.8, 114.2, -11.4, 41.9, 23.5, 37.8,
                "Summit League struggle", "Team building",
                "Wes Washpun, Jay Situada", "0-120", "N/A"));
 
        // ============================
        // MIDWEST REGION - SEEDS 1-16
        // ============================
        
        teams.add(new Team("UConn", 1, "MIDWEST", "Dan Hurley", 32, 2,
                82.9, 61.8, 121.5, 92.1, 29.4, 57.5, 10.2, 55.2,
                "Back-to-back champs mentality", "Championship experience",
                "Donovan Clingan, Tristen Newton", "150-30", "15-1"));
        
        teams.add(new Team("Purdue", 2, "MIDWEST", "Matt Painter", 29, 5,
                80.2, 64.5, 119.2, 97.8, 21.4, 56.1, 12.6, 52.8,
                "Big Ten powerhouse", "Consistency and size",
                "Zach Edey, Braden Smith", "110-55", "10-5"));
        
        teams.add(new Team("Ohio State", 3, "MIDWEST", "Chris Holtmann", 28, 6,
                79.5, 65.2, 118.1, 98.5, 19.6, 55.3, 13.1, 51.5,
                "Fast-paced Big Ten", "Offensive weapons",
                "Roddy Gayle Jr., Devin Royal", "95-65", "8-6"));
        
        teams.add(new Team("Wisconsin", 4, "MIDWEST", "Greg Gard", 26, 8,
                76.8, 67.1, 115.2, 100.2, 15.0, 53.2, 14.5, 50.1,
                "Big Ten staple", "Coach stability",
                "Max Klesmit, Nate Reuvers", "100-70", "13-7"));
        
        teams.add(new Team("Oklahoma", 5, "MIDWEST", "Porter Moser", 24, 10,
                75.2, 69.5, 113.8, 102.8, 11.0, 51.8, 15.2, 48.9,
                "SEC transition", "Development mode",
                "Jalon Moore, Jaylen Hill", "60-80", "3-9"));
        
        teams.add(new Team("Nebraska", 6, "MIDWEST", "Fred Hoiberg", 26, 8,
                77.1, 66.8, 115.8, 99.5, 16.3, 54.1, 13.8, 51.2,
                "Big Ten emerging", "Recruiting momentum",
                "Kaleb Joseph, Javon Pickett", "70-90", "2-8"));
        
        teams.add(new Team("Vanderbilt", 7, "MIDWEST", "Jerry Stackhouse", 25, 9,
                74.5, 68.2, 112.5, 101.1, 11.4, 50.9, 15.9, 49.5,
                "SEC competitive", "Coaching energy",
                "Myles Stute, Jason Rivera", "50-100", "1-7"));
        
        teams.add(new Team("LSU", 8, "MIDWEST", "Matt McMahon", 23, 11,
                72.8, 70.1, 110.8, 103.5, 7.3, 49.5, 16.8, 47.2,
                "SEC scrappy", "Tournament experience",
                "Trae Hannibal, KJ Williams", "40-110", "4-8"));
        
        teams.add(new Team("Missouri", 9, "MIDWEST", "Dennis Gates", 22, 12,
                71.5, 71.5, 109.5, 104.8, 4.7, 48.2, 17.5, 46.1,
                "Big 12/SEC balanced", "Coaching young",
                "Caleb Lohner, Tai Jones", "35-115", "N/A"));
        
        teams.add(new Team("Drexel", 10, "MIDWEST", "Zack Spiker", 21, 13,
                70.2, 72.8, 108.1, 105.9, 2.2, 47.1, 18.9, 44.8,
                "Colonial solid", "Defensive pressure",
                "Amari Williams, Jaylen Gadsden", "30-120", "N/A"));
        
        teams.add(new Team("UNC Wilmington", 11, "MIDWEST", "Lorn Brown", 20, 14,
                69.8, 73.5, 107.5, 106.8, 0.7, 46.5, 19.2, 43.9,
                "CAA strong", "Mid-major potential",
                "Jaylen Fornes, Jansen Lautz", "25-125", "N/A"));
        
        teams.add(new Team("Penn", 12, "MIDWEST", "Steve Donahue", 19, 15,
                68.5, 74.2, 106.2, 107.9, -1.7, 45.2, 20.1, 42.5,
                "Ivy League champion", "Academic excellence",
                "Ryan Betley, Lewis Djonkeng", "20-130", "N/A"));
        
        teams.add(new Team("UT Arlington", 13, "MIDWEST", "Corey Barr", 21, 13,
                69.5, 75.1, 106.8, 108.9, -2.1, 45.8, 20.8, 41.2,
                "Sun Belt challenger", "Scrappy play",
                "David Azore, Javon Chad", "15-135", "N/A"));
        
        teams.add(new Team("Southern Illinois", 14, "MIDWEST", "Bryan Mullins", 19, 15,
                68.2, 76.2, 105.5, 110.2, -4.7, 44.1, 21.5, 40.1,
                "MVC competitve", "Mid-major grind",
                "Marcus Domask, TJ Strickland", "10-140", "N/A"));
        
        teams.add(new Team("Winthrop", 15, "MIDWEST", "Jack Katz", 18, 16,
                67.1, 77.5, 104.2, 111.8, -7.6, 42.9, 22.3, 38.9,
                "Big South player", "Tournament spirit",
                "Micheal Anane, Hunter Tyson", "5-145", "N/A"));
        
        teams.add(new Team("San Jose State", 16, "MIDWEST", "Steve Tovor", 15, 19,
                65.9, 78.9, 102.1, 113.5, -11.4, 40.8, 23.8, 37.2,
                "Mountain West bottom", "Building block",
                "Braxton Bayless, Javon Clark", "0-150", "N/A"));
 
        return teams;
    }

}
