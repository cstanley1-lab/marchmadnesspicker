package edu.guilford;

import java.util.ArrayList;

// This class will represent the bracket structure of the tournament
// controls how the tournament progresses, how teams advance, and how the matchups are organized
// stores teams in each round and updates as the user picks winners and advances through the bracket

public class Bracket {
    // 64 teams
    private ArrayList<TeamInfo> teams;

    // each round is a list of matchups, where each matchup is a pair of teams
    private ArrayList<TeamInfo> roundOf64;
    private ArrayList<TeamInfo> roundOf32;
    private ArrayList<TeamInfo> sweet16;
    private ArrayList<TeamInfo> elite8;
    private ArrayList<TeamInfo> final4;
    private ArrayList<TeamInfo> championship;

    private TeamInfo champion;

    // constructor to initialize the bracket with the initial teams and matchups
    public Bracket(ArrayList<TeamInfo> teams) {

        this.teams = teams;

        // Initialize rounds
        roundOf64 = new ArrayList<>();
        roundOf32 = new ArrayList<>();  
        sweet16 = new ArrayList<>();
        elite8 = new ArrayList<>();
        final4 = new ArrayList<>();
        championship = new ArrayList<>();

        initializeBracket();
    }

    // round of 64 matchups

    private void initializeBracket() {
        for (TeamInfo team : teams) {
            roundOf64.add(team);
        }
    }

    // round progression
    // 64 ==> 32

    public void advanceToRoundOf32(TeamInfo winner) {
        roundOf32.add(winner);
    }

    // 32 ==> sweet 16
    public void advanceToSweet16(TeamInfo winner) {
        sweet16.add(winner);
    }

    // sweet 16 ==> elite 8
    public void advanceToElite8(TeamInfo winner) {
        elite8.add(winner);
    }

    // elite 8 ==> final 4
    public void advanceToFinal4(TeamInfo winner) {
        final4.add(winner);
    }

    // final 4 ==> championship
    public void advanceToChampionship(TeamInfo winner) {
        championship.add(winner);
    }

    // championship ==> champion
    public void setChampion(TeamInfo winner) {
        champion = winner;
    }

    // Getters for rounds and champion
    public ArrayList<TeamInfo> getRoundOf64() {
        return roundOf64;
    }
    public ArrayList<TeamInfo> getRoundOf32() {
        return roundOf32;
    }
    public ArrayList<TeamInfo> getSweet16() {
        return sweet16;
    }
    public ArrayList<TeamInfo> getElite8() {
        return elite8;
    }
    public ArrayList<TeamInfo> getFinal4() {
        return final4;
    }
    public ArrayList<TeamInfo> getChampionship() {
        return championship;
    }
    public TeamInfo getChampion() {
        return champion;
    }

    // matchup and storing of new winners

    public TeamInfo[] getMatchup (ArrayList<TeamInfo> round,int index) { 

        TeamInfo[] matchup = new TeamInfo[2];
        
        matchup[0] = round.get(index);
        matchup[1] = round.get(index + 1);
        return matchup;
    }

    // clears next round 

    public void clearNextRounds() {
        roundOf32.clear();
        sweet16.clear();
        elite8.clear();
        final4.clear();
        championship.clear();
        champion = null;
    }
}
