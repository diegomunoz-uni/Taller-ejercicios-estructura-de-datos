package arraylist;


public class Match {

    private final String homeTeam;
    private final String visitingTeam;
    private final int homeGoals;
    private final int visitingGoals;

    public Match(String homeTeam, String visitingTeam, int homeGoals, int visitingGoals) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeGoals = homeGoals;
        this.visitingGoals = visitingGoals;
    }

    public String getHomeTeam()      { return homeTeam; }
    public String getVisitingTeam()  { return visitingTeam; }
    public int getHomeGoals()        { return homeGoals; }
    public int getVisitingGoals()    { return visitingGoals; }

    public boolean isHomeWin()     { return homeGoals > visitingGoals; }
    public boolean isVisitorWin()  { return visitingGoals > homeGoals; }
    public boolean isDraw()        { return homeGoals == visitingGoals; }

    @Override
    public String toString() {
        String result = isHomeWin() ? "Home wins" : isVisitorWin() ? "Visitor wins" : "Draw";
        return String.format("%-12s %d - %d  %-12s [%s]",
                homeTeam, homeGoals, visitingGoals, visitingTeam, result);
    }
}
