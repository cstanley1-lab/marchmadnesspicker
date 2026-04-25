package edu.guilford;

    class Team {
    // this class will represent a single team in the tournament, storing all
    // relevant information and statistics for that team
    // storing stats, records and other info

    private String name;
    private int seed;
    private String coachName;
    private String region; // ADDED: Track which region this team is in (East, West, South, Midwest)

    private int wins;
    private int losses;

    // Statistical metrics from KenPom and other sources
    private double ppg; // points per game
    private double oppg; // opponents points per game
    private double offensiveRating;
    private double defensiveRating;
    private double netRating; // offensive rating - defensive rating
    private double efg; // effective field goal percentage
    private double turnoverPct;
    private double reboundPct;

    // Additional team information
    private String playstyle;
    private String coachPhilosophy;
    private String keyPlayers;

    private String schoolRecord; // March Madness record for the school
    private String coachRecord; // March Madness record for the coach

    // Constructor that creates our team object with all relevant info
    public Team(String name, int seed, String region, String coachName, int wins, int losses,
            double ppg, double oppg, double offensiveRating, double defensiveRating,
            double netRating, double efg, double turnoverPct, double reboundPct,
            String playstyle, String coachPhilosophy, String keyPlayers,
            String schoolRecord, String coachRecord) {
        this.name = name;
        this.seed = seed;
        this.region = region;
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
        this.reboundPct = reboundPct;
        this.playstyle = playstyle;
        this.coachPhilosophy = coachPhilosophy;
        this.keyPlayers = keyPlayers;
        this.schoolRecord = schoolRecord;
        this.coachRecord = coachRecord;
    }

    // Getters for all the fields
    public String getName() {
        return name;
    }

    public int getSeed() {
        return seed;
    }

    public String getRegion() {
        return region;
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

    public double getReboundPct() {
        return reboundPct;
    }

    public String getPlaystyle() {
        return playstyle;
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

    public String getMarchMadnessRecord() {
        return coachRecord;
    }

    public String getCoachRecord() {
        return coachRecord;
    }

    // toString method to display team information in a readable format
    // preferable the seed + name + record

    @Override
    public String toString() {
        return "(" + seed + ") " + name + " [" + wins + "-" + losses + "]";
    }

    // displaying the full informaiton about the team in a formated string
    public String getFullInfo() {
        return "Team: " + name +
                "\nRegion: " + region +
                "\nSeed: " + seed +
                "\nCoach: " + coachName +
                "\nRecord: " + wins + "-" + losses +

                "\n\n=== OFFENSIVE STATS ===" +
                "\nPPG: " + ppg +
                "\nOff Rating: " + offensiveRating +
                "\nEFG%: " + efg +

                "\n\n=== DEFENSIVE STATS ===" +
                "\nOpp PPG: " + oppg +
                "\nDef Rating: " + defensiveRating +
                "\nRebound%: " + reboundPct +

                "\n\n=== EFFICIENCY ===" +
                "\nNet Rating: " + netRating +
                "\nTurnover%: " + turnoverPct +

                "\n\n=== TEAM INFO ===" +
                "\nKey Players: " + keyPlayers +
                "\nPlaystyle: " + playstyle +
                "\nCoach Philosophy: " + coachPhilosophy +

                "\n\n=== TOURNAMENT HISTORY ===" +
                "\nSchool March Madness Record: " + schoolRecord +
                "\nCoach March Madness Record: " + coachRecord;
    }

}
