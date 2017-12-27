package cricket;

public class StrongWicketKeeper extends Player implements IKeeper {
	int numberOfCatches;
    int numberOfStumpings;
    
    StrongWicketKeeper(String name,int matchesPlayed,int runsScored,int numberOfCatches,int numberOfStumpings)
    {
        super(name, matchesPlayed, runsScored);
        this.numberOfCatches = numberOfCatches;
        this.numberOfStumpings = numberOfStumpings;
    }

    public void keepWickets()
    {
    }
    
    public void stumpBatsmen()
    {
    }
    
    public void makeAppeals()
    {
    }

    void print()
    {    
        super.print();
        System.out.print(" He also keeps the wickets and has "+ numberOfCatches +" catches and "+ numberOfStumpings +" stumpings in his account.");
    }
}
