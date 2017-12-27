package cricket;

public class StrongBowler extends Player implements IBowler 
	{
	    int numberOfWickets;
	    int numberOf5WicketInnings;
	    
	    StrongBowler(String name,int matchesPlayed,int runsScored,int numberOfWickets,int numberOf5WicketInnings)
	    {
	        super(name, matchesPlayed, runsScored);
	        this.numberOfWickets= numberOfWickets;
	        this.numberOf5WicketInnings = numberOf5WicketInnings;
	    }

	    public void openInnings()
	    {
	    }

	    public void bowlYorkers()
	    {
	        System.out.println("Strong Bowler "+ name +" is bowling yorkers.");
	    }
	    
	    public void takeWickets()
	    {
	        System.out.println("Strong Bowler "+ name +" is taking wickets.");
	    }

	    void print()
	    {    
	        super.print();
	        System.out.print(" He is also a good bowler and has taken "+ numberOfWickets +" wickets. He has "+ numberOf5WicketInnings +" 5WI(5-Wicket Innings) in his account.");
	    }

}
