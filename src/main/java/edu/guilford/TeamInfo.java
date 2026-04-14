package edu.guilford;

// Our team information class that will hold all the relevant data for each team in the tournament
// stores all stats, records, and descriptions of teams, players, and coaches
// this will be used to provide the information for the stats and suggestions in our GUI

public class TeamInfo {

    // Basic team information
    private String name;
    private int seed;
    private String coachName;

    // Team stats
    private int wins;
    private int losses;
    private double ppg;             // points per game
    private double oppg;            // opponent points per game
    private double offensiveRating;  // offensive rating
    private double defensiveRating;  // defensive rating
    private double netRating;             // net rating
    private double efg;              // effective field goal percentage
    private double turnoverPct;      // turnover percentage
    private double reboundingPct;    // rebounding percentage

    // descriptions and other info
    private String playStyle;
    private String coachPhilosophy;
    private String keyPlayers;

    // march madness history
    private String schoolRecord;
    private String coachRecord;

    // contstructor to create a team object

    public TeamInfo(String name, int seed, String coachName, int wins, int losses, double ppg, double oppg,
                    double offensiveRating, double defensiveRating, double netRating, double efg,
                    double turnoverPct, double reboundingPct, String playStyle, String coachPhilosophy,
                    String keyPlayers, String schoolRecord, String coachRecord) {
        this.name = name;
        this.seed = seed;
        this.coachName = coachName;
       
        this.wins = wins;
        this.losses = losses;
        
        this.ppg = ppg;
        this.oppg = oppg;
        this.offensiveRating = offensiveRating;
        this.defensiveRating = defensiveRating;
      
        this.netRating = netRating;
        this.efg = efg;
        this.turnoverPct = turnoverPct;
        this.reboundingPct = reboundingPct;
       
        this.playStyle = playStyle;
        this.coachPhilosophy = coachPhilosophy;
        this.keyPlayers = keyPlayers;
       
        this.schoolRecord = schoolRecord;
        this.coachRecord = coachRecord;

    }

    // getters
    public String getName() {
        return name;
    }
    public int getSeed() {
        return seed;
    }
    public String getCoachName() {
        return coachName;
    }
    public int getWins() {
        return wins;
    }
    public int getLosses() {
        return losses;
    }
    public double getPpg() {
        return ppg;
    }
    public double getOppg() {
        return oppg;
    }
    public double getOffensiveRating() {
        return offensiveRating;
    }
    public double getDefensiveRating() {
        return defensiveRating;
    }
    public double getNetRating() {
        return netRating;
    }
    public double getEfg() {
        return efg;
    }
    public double getTurnoverPct() {
        return turnoverPct;
    }
    public double getReboundingPct() {
        return reboundingPct;
    }
    public String getPlayStyle() {
        return playStyle;
    }
    public String getCoachPhilosophy() {
        return coachPhilosophy;
    }
    public String getKeyPlayers() {
        return keyPlayers;
    }
    public String getSchoolRecord() {
        return schoolRecord;
    }
    public String getCoachRecord() {
        return coachRecord;
    }

    // toString method for easy display of team info
    public String toString() {
        return name + " (Seed: " + seed + ", Coach: " + coachName + ", Record: " + wins + "-" + losses + ")";
    }

    // returns full formatted team information
    public String getFullInfo() {
        return "Team: " + name +
        "\nSeed: " + seed +
        "\nCoach: " + coachName +
        "\nRecord: " + wins + "-" + losses +
      
        "\nPPG: " + ppg +
        "\nOPPG: " + oppg +
       
        "\nOffensive Rating: " + offensiveRating +
        "\nDefensive Rating: " + defensiveRating +
        "\nNet Rating: " + netRating +
        "\nEFG: " + efg +
      
        "\nTurnover Pct: " + turnoverPct +
        "\nRebounding Pct: " + reboundingPct +
      
        "\nPlay Style: " + playStyle +
        "\nCoach Philosophy: " + coachPhilosophy +
        "\nKey Players: " + keyPlayers +
        "\nSchool Record: " + schoolRecord +
        "\nCoach Record: " + coachRecord;

    }
}
