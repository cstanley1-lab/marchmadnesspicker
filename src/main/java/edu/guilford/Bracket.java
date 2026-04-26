package edu.guilford;

import java.util.ArrayList;

public class Bracket {

    // this class manages our structure, storing teams by region and round, and tracks winners as they go through the bracket

    // All tournament teams
    private ArrayList<Team> teams;

    // teams organized by tournament round 
    private ArrayList<Team> roundOf64;
    private ArrayList<Team> roundOf32;
    private ArrayList<Team> sweet16;
    private ArrayList<Team> elite8;
    private ArrayList<Team> final4;
    private ArrayList<Team> championship;

    // champion
    private Team champion;

    // storing the winning team for each region so we can display them on our main region selection screen
    private Team eastRegionChampion;
    private Team westRegionChampion;
    private Team southRegionChampion;
    private Team midwestRegionChampion;

    // constructor to initialize the bracket with all of the 64 teams 

    public Bracket(ArrayList <Team> teams) {
        this.teams = teams;
 
        // Initialize each round's ArrayList
        roundOf64 = new ArrayList<>();
        roundOf32 = new ArrayList<>();
        sweet16 = new ArrayList<>();
        elite8 = new ArrayList<>();
        final4 = new ArrayList<>();
        championship = new ArrayList<>();

        // initalize regional champions to null
        // making sure our main screen shows "no champion selected" initially
        eastRegionChampion = null;
        westRegionChampion = null;
        southRegionChampion = null;
        midwestRegionChampion = null;
 
        // Load all teams into Round of 64
        initializeBracket();
    }

    // initialize the bracket by adding all teams to round of 64
    private void initializeBracket() {
        for (Team t : teams) {
            roundOf64.add(t);
        }
    }


    // advancing teams 
    public void advanceToRoundOf32(Team winner) {
        roundOf32.add(winner);
    }

    public void advanceToSweet16(Team winner) {
        sweet16.add(winner);

        }

        public void advanceToElite8(Team winner) {
        elite8.add(winner);
    }

        public void advanceToFinal4(Team winner) {
        final4.add(winner);
        }
 public void advanceToChampionship(Team winner) {
        championship.add(winner);
    }
    public void setChampion(Team winner) {
        champion = winner;
    }

    // method to set the regional champion when a region tournamnet is completed, so we can display it on the main screen
    //stores the winner in the appropriate variable based on the region they are from
    public void setRegionalChampion(String region, Team champion) {
        switch (region.toLowerCase()) {
            case "east":
                eastRegionChampion = champion;
                break;
            case "west":
                westRegionChampion = champion;
                break;
            case "south":
                southRegionChampion = champion;
                break;
            case "midwest":
                midwestRegionChampion = champion;
                break;
        }
    }

    // new method to get the regional champion for a specific region, so we can display it on the main screen
    // returns null if thatt region hasnt been completed yet so we can say "no champion selected" on the main screen
    // returns team if completed 
    public Team getRegionalChampion(String region) {
        switch (region.toLowerCase()) {
            case "east":
                return eastRegionChampion;
            case "west":
                return westRegionChampion;
            case "south":
                return southRegionChampion;
            case "midwest":
                return midwestRegionChampion;
            default:
                return null;
        }
    }

    // getters for each round and champion
     public ArrayList<Team> getRoundOf64() {
        return roundOf64;
    }

    public ArrayList<Team> getRoundOf32() {
        return roundOf32;
    }
     public ArrayList<Team> getSweet16() {
        return sweet16;
    }
      public ArrayList<Team> getElite8() {
        return elite8;
    }
       public ArrayList<Team> getFinal4() {
        return final4;
    }
        public ArrayList<Team> getChampionship() {
        return championship;
    }
     public Team getChampion() {
        return champion;
    }

    // getting a specific matchup from a round 
    // pairing teams for games 
     public Team[] getMatchup(ArrayList<Team> round, int index) {
        Team[] matchup = new Team[2];
 
        if (index * 2 + 1 >= round.size()) {
            return null;
        }

        matchup[0] = round.get(index * 2);
        matchup[1] = round.get(index * 2 + 1);
        return matchup;
        }

    // clearing all the round data and restting for a new backet
    public void resetBracket() {
        roundOf64.clear();
        roundOf32.clear();
        sweet16.clear();
        elite8.clear();
        final4.clear();
        championship.clear();
        champion = null;
         
        // reset regional champions when starting a new bracket
        // ensuring the main screen shows all regions as "no champion selected" when starting a new bracket
        eastRegionChampion = null;
        westRegionChampion = null;
        southRegionChampion = null;
        midwestRegionChampion = null;


        initializeBracket();
    }

    // get the region champion for the specific region

      public Team getRegionChampion(String region) {
        for (Team team : final4) {
            if (team.getRegion().equals(region)) {
                return team;
            }
        }
        return null;
    }
}
