package cricket;

public class AllRounderBatsmen extends StrongBatsmen implements IBowler 
{
	AllRounderBatsmen(String name,int matchesPlayed,int runsScored,int numberOfCenturies,int numberOfHalfCenturies)
    {
        super(name, matchesPlayed, runsScored, numberOfCenturies, numberOfHalfCenturies);
    }

    public void openInnings()
    {
    }

    public void bowlYorkers()
    {
        System.out.println("All Rounder Batsmen "+ name +" is bowling yorkers.");
    }
    
    public void takeWickets()
    {
        System.out.println("All Rounder Batsmen "+ name +" is taking wickets.");
    }
}
