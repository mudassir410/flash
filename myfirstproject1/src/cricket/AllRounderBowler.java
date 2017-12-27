package cricket;

public class AllRounderBowler extends StrongBowler implements IBatsmen 
{
	AllRounderBowler(String name,int matchesPlayed,int runsScored,int numberOfWickets,int numberOf5WicketInnings)
    {
        super(name, matchesPlayed, runsScored, numberOfWickets, numberOf5WicketInnings);
    }

    public void openInnings()
    {
    }

    public void makeCentury()
    {
    }
    
    public void makeHalfCentury()
    {
    }
}
