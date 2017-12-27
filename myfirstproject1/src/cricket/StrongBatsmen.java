package cricket;

public class StrongBatsmen extends Player implements IBatsmen 
{
	int numberOfCenturies;
    int numberOfHalfCenturies;

    StrongBatsmen(String name,int matchesPlayed,int runsScored,int numberOfCenturies,int numberOfHalfCenturies)
    {
        super(name, matchesPlayed, runsScored);
        this.numberOfCenturies = numberOfCenturies;
        this.numberOfHalfCenturies = numberOfHalfCenturies;
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

    void print()
    {    
        super.print();
        System.out.print(" He is a strong batsmen and made "+ numberOfCenturies +  " centuries and "+ numberOfHalfCenturies +" half centuries.");
    }
}
