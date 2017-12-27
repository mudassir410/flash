package myfirstproject1;

public class ComparingUsingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie julai = new Movie();
        julai.name = "Julai";
        julai.director = "Trivikram";
        julai.stuntMaster = "Peter Hein";
        julai.numberOfArtists = 57;
        julai.releaseDate = "15-Aug-2012";
    
        julai.collectionsFirstWeek = 215467.8;
        julai.collectionsRestOfTheDays = 541132.5;
        
        Movie lifeisbeautiful = new Movie();
        lifeisbeautiful.name = "lifeisbeautiful";
        lifeisbeautiful.director = "trivikram";
        lifeisbeautiful.stuntMaster = "peter hein";
        lifeisbeautiful.numberOfArtists = 57;
        lifeisbeautiful.releaseDate = "20 aug 2015";
        
        lifeisbeautiful.collectionsFirstWeek = 215467.8;
        lifeisbeautiful.collectionsRestOfTheDays =20000000;
    
        Drama ramayan = new Drama();
        ramayan.name = "Ramayana";
        ramayan.writer = "Valmiki";
        ramayan.stageSetter = "Anjaneya";
        ramayan.numberOfArtists = 200000;
        ramayan.releaseDate = "17-Mar-1659 BC";
        
        Drama devdas = new Drama();
        devdas.name = "devdas";
        devdas.writer = "Valmiki";
        devdas.stageSetter = "Anjaneya";
        devdas.numberOfArtists = 200000;
        devdas.releaseDate = "17-Mar-1659 BC";
    
        devdas.collectionsFirstWeek = 32842.86;
        devdas.collectionsRestOfTheDays = 9349.51;
    
    
        Circus jumbo = new Circus();
        jumbo.name = "Jumbo";
        jumbo.ringMaster = "Antony";
        jumbo.numberOfArtists = 316;
        jumbo.releaseDate = "16-Dec-1997";
    
        jumbo.collectionsFirstWeek = 23132.21;
        jumbo.collectionsRestOfTheDays = 6725.09;
    
        compareEntertainments(jumbo,devdas, lifeisbeautiful);
        
    }
    
    public static void compareEntertainments(Entertainment ent1, Entertainment ent2, Entertainment ent3)
    {
    if((ent1.getTotalCollections() > ent2.getTotalCollections()) && (ent1.getTotalCollections() > ent3.getTotalCollections()))
        {
            System.out.println(ent1.name + " has the highest collections.");
        }
        else if (ent2.getTotalCollections() > ent3.getTotalCollections())
        {
            System.out.println(ent2.name + " has the highest collections.");
        }
        else
        {
            System.out.println(ent3.name + " has the highest collections.");
        }
    }

}

class Entertainment
{
    String name;
    int numberOfArtists;
    String releaseDate;
    double collectionsFirstWeek;
    double collectionsRestOfTheDays;

    double getTotalCollections()
    {
        return collectionsFirstWeek + collectionsRestOfTheDays;
    }

    void printEntertainment()
    {
        System.out.println( name + " got the following collections " );
        System.out.println("First Week : " + collectionsFirstWeek);
        System.out.println("Rest Of The Days : " + collectionsRestOfTheDays);
        System.out.println("Total Collections : " + getTotalCollections());
        System.out.println("Total Artists : " + numberOfArtists);
        System.out.println("Release Date : " + releaseDate);
    }

}

class Movie extends Entertainment
{
    String director;
    String stuntMaster;

    void print()
    {
        printEntertainment();
        System.out.println("Director : " + director);
        System.out.println("Stunt Master : " + stuntMaster);
    }
}

class Drama extends Entertainment
{
    String writer;
    String stageSetter;


    void print()
    {
        printEntertainment();
        System.out.println("Writer : " + writer);
        System.out.println("Stage Setter : " + stageSetter);
    }
}

class Circus extends Entertainment
{
    String ringMaster;

    void print()
    {
        printEntertainment();
        System.out.println("Ring Master : " + ringMaster);

	}

}
