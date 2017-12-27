package cricket;

public abstract class Player {
	String name;
    int matchesPlayed;
    int runsScored;

    Player (String name,int matchesPlayed,int runsScored)
    {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.runsScored = runsScored;
    }
    
    
    public void bat()
    {
    }

    public void makeSomeRuns()
    {
    }

    void print()
    {
        System.out.print(name  +" played "+ matchesPlayed +" matches and scored "+ runsScored +" runs.");
    }
}
