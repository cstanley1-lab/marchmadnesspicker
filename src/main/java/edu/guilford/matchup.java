package edu.guilford;

public class matchup {
    // our indiviudal matchup class that will represent a single game between two teams in the tournament

    private TeamInfo team1;
    private TeamInfo team2;

    // winner of the matchup
    private TeamInfo winner;

    // constructor to create a matchup with two teams
    public matchup(TeamInfo team1, TeamInfo team2) {
        this.team1 = team1;
        this.team2 = team2;
        this.winner = null; // no winner yet 
    }
    // Getters 

    public TeamInfo getTeam1() {
        return team1;
    }
    public TeamInfo getTeam2() {
        return team2;
    }

    // set the winner of the matcup based on user selection

    public void setWinner( TeamInfo winner ) {
        this.winner = winner;
    }

    // stat comparison method that will compare the stats of the two teams 
    // and provide a suggestion for which team to pick based on the data

    // returns true if team1 has better ppg
    public boolean comparePPG() {
        return team1.getPpg() > team2.getPpg();
    }

    // lower opponent points per game is better
    public boolean compareOPPG() {
        return team1.getOppg() < team2.getOppg();
    }

    // higher offensive rating is better
    public boolean compareOffensiveRating() {
        return team1.getOffensiveRating() > team2.getOffensiveRating();
    }

    // lower defensive rating is better
    public boolean compareDefensiveRating() {
        return team1.getDefensiveRating() < team2.getDefensiveRating();
    }

    // higher net rating is better
    public boolean compareNetRating() {
        return team1.getNetRating() > team2.getNetRating();
    }

    // higher effective field goal percentage is better
    public boolean compareEFG() {
        return team1.getEfg() > team2.getEfg();
    }

    // lower turnover percentage is better
    public boolean compareTurnoverPct() {
        return team1.getTurnoverPct() < team2.getTurnoverPct();
    }

    // higher rebounding percentage is better
    public boolean compareReboundingPct() {
        return team1.getReboundingPct() > team2.getReboundingPct();
    }

    // better win percentage is better
    public boolean compareWinPct() {
        double team1WinPct = (double) team1.getWins() / (team1.getWins() + team1.getLosses());
        double team2WinPct = (double) team2.getWins() / (team2.getWins() + team2.getLosses());
        return team1WinPct > team2WinPct;
    }

    // calculates a simple score for team1 based on the stats

    public int calculateTeam1Score() {
        int score = 0;
        if (comparePPG()) score++;
        if (compareOPPG()) score++;
        if (compareOffensiveRating()) score++;
        if (compareDefensiveRating()) score++;
        if (compareNetRating()) score++;
        if (compareEFG()) score++;
        if (compareTurnoverPct()) score++;
        if (compareReboundingPct()) score++;
        if (compareWinPct()) score++;
        return score;
    }

    // calculates a simple score for team2 based on the stats

    public int calculateTeam2Score() {
        return 9 - calculateTeam1Score(); // since there are 9 comparisons, team2's score is the complement of team1's score

    }

    // suggest a winner based on stats

    public TeamInfo getSuggestedWinner() {

        if (calculateTeam1Score() > calculateTeam2Score()) {
            return team1;
        } else if (calculateTeam2Score() > calculateTeam1Score()) {
            return team2;
        } else {
            return null; // tie, no clear suggestion
        }
    }
    // upset detection 

    public boolean isUpset() {

        if (winner == null) return false;

        if (winner == team1 && team1.getSeed() > team2.getSeed()){
            return true;
        }
        if (winner == team2 && team2.getSeed() > team1.getSeed()) {
            return true;
        }
        return false;
    }

}
