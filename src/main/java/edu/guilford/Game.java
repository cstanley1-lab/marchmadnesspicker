package edu.guilford;

public class Game {
    // this class will represetnt a single matchup between two teams
    // will contain the teams, the winnner, and statistical comparison methods

    private Team team1;
    private Team team2;
    private Team winner;

    // constructor to create a game between two teams
    public Game(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
        this.winner = null; // winner will be determined later
    }

    // getters 
    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public Team getWinner() {
        return winner;
    }

    // set the winner of the matchup 
    public void setWinner (Team winner) { 
        this.winner = winner;
    }

    // statistical comparison methods 
    // comparing stats between the two teams and returning true if team1 is better in that stat 

    public boolean team1BetterPPG() {
        return team1.getPpg() > team2.getPpg();
    }

    public boolean team1BetterDefense() {
        return team1.getOppg() < team2.getOppg();
    }

    public boolean team1BetterOffense() {
        return team1.getOffensiveRating() > team2.getOffensiveRating();
    }

    public boolean team1BetterDefRating() {
        return team1.getDefensiveRating() < team2.getDefensiveRating();
    }

    public boolean team1BetterNetRating() {
        return team1.getNetRating() > team2.getNetRating();
    }

     public boolean team1BetterEFG() {
        return team1.getEfg() > team2.getEfg();
    }
     public boolean team1BetterTO() {
        return team1.getTurnoverPct() < team2.getTurnoverPct();
    }
    public boolean team1BetterReboundPct() {
        return team1.getReboundPct() > team2.getReboundPct();
    }

    // com[are win percentage, higher win percentage is better, return true is team 1 has a better win percentage 
      public boolean team1BetterWinPct() {
        double team1WinPct = (double) team1.getWins() / (team1.getWins() + team1.getLosses());
        double team2WinPct = (double) team2.getWins() / (team2.getWins() + team2.getLosses());
        return team1WinPct > team2WinPct;
    }


    // predicting a winner and suggesting it based on the statistical comaprions,, returning a score from 0-9 (team 1s statistical adavantage)
    public int calculateTeam1Score() {
        int score = 0;
        
        if (team1BetterPPG())
            score++;
        if (team1BetterDefense())
            score++;
        if (team1BetterOffense())
            score++;
        if (team1BetterDefRating())
            score++;
        if (team1BetterNetRating())
            score++;
        if (team1BetterEFG())
            score++;
        if (team1BetterTO())
            score++;
        if (team1BetterReboundPct())
            score++;
        if (team1BetterWinPct())
            score++;
            
        return score;
    }

    // calculating team 2s score 0-9
     public int calculateTeam2Score() {
        return 9 - calculateTeam1Score();
    }

    // the suggested winner
     public Team getSuggestedWinner() {
        int team1Score = calculateTeam1Score();
        int team2Score = calculateTeam2Score();
        
        if (team1Score > team2Score) {
            return team1;
        } else if (team2Score > team1Score) {
            return team2;
        } else {
            return null; // Statistical tie - no clear winner
        }
    }

    // upset prediction

     public boolean isUpset() {
        // Cannot determine upset if no winner has been selected
        if (winner == null)
            return false;
 
        // If Team 1 won and Team 1 has a higher seed number than Team 2, it's an upset
        // (Lower seed number = better seed = lower number is the favorite)
        if (winner == team1 && team1.getSeed() > team2.getSeed()) {
            return true;
        }
        
        // If Team 2 won and Team 2 has a higher seed number than Team 1, it's an upset
        if (winner == team2 && team2.getSeed() > team1.getSeed()) {
            return true;
        }
        
        return false;
    }

    // printing our possible prediction 
     public String getPredictionStatement() {
        Team suggested = getSuggestedWinner();
        int team1Score = calculateTeam1Score();
        int team2Score = calculateTeam2Score();
        
        if (suggested == null) {
            return "Statistical Tie (4.5-4.5)";
        } else if (suggested == team1) {
            return team1.getName() + " Favored (" + team1Score + "-" + team2Score + ")";
        } else {
            return team2.getName() + " Favored (" + team2Score + "-" + team1Score + ")";
        }
    }

}
