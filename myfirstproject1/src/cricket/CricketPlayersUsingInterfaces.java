package cricket;

public class CricketPlayersUsingInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrongBatsmen sachin =new StrongBatsmen("Sachin",250,11324,100,125);
        StrongWicketKeeper dhoni =new StrongWicketKeeper("Dhoni",153,6021,120,67);
        StrongBatsmen shewag =new StrongBatsmen("Shewag",110,4341,22,40);
        AllRounderBatsmen yuvraj =new AllRounderBatsmen("Yuvraj",105,6533,15,46);
        StrongBatsmen kohli =new StrongBatsmen("Kohli",75,4003,25,60);
        AllRounderBatsmen raina =new AllRounderBatsmen("Raina",34,2600,12,19);
        AllRounderBatsmen rohit =new AllRounderBatsmen("Rohit",25,1500,5,9);
        StrongBowler harbhajan =new StrongBowler("Harbhajan",189,1500,320,4);
        StrongBowler zaheer =new StrongBowler("Zaheer",150,900,220,4);
        StrongBowler umesh =new StrongBowler("Umesh",25,150,105,2);
        AllRounderBowler ashwin =new AllRounderBowler("Aswin",15,200,60,2);
    
        bowl(1, zaheer);
        bowl(2, umesh);
        bowl(3, ashwin);
        bowl(4, yuvraj);
        bowl(5, raina);
    }
    
    public static void bowl(int overNumber,IBowler iBowler)
    {
        System.out.println("Bowling over "+ overNumber);
        System.out.println("--------------------------");
        iBowler.bowlYorkers();
        iBowler.takeWickets();
    }

	}
