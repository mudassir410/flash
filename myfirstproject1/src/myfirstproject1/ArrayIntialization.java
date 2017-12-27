package myfirstproject1;

public class ArrayIntialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//one dimensional array
		int one[]= new int[]{1,2,3,4,5,6};
		for (int i=0;i<one.length;i++)
			System.out.println("one is " + one[i]);
		System.out.println("enhanced for loop in array");
		
		for (int i:one)
			System.out.println("one enhanced for loop" + i);
		 // India - team 0
        // Pakistan - team 1
        // Australia - team 2
        // Srilanka - team 3
        // 2008 - year 0
        // 2009 - year 1
        // 2010 - year 2
        
        
        int[][] scores = new int[3][4];
        
        scores[0][0] = 150; // Score in year 2008 (year 0) for India (team 0)
        scores[0][1] = 170; // Score in year 2008 (year 0) for Pakistan (team 1)
        scores[0][2] = 183; // Score in year 2008 (year 0) for Australia (team 2)
        scores[0][3] = 216; // Score in year 2008 (year 0) for Srilanka (team 3)
        
        scores[1][0] = 258; // Score in year 2009 (year 1) for India (team 0)
        scores[1][1] = 221; // Score in year 2009 (year 1) for Pakistan (team 1)
        scores[1][2] = 241; // Score in year 2009 (year 1) for Australia (team 2)
        scores[1][3] = 230; // Score in year 2009 (year 1) for Srilanka (team 3)
        
        scores[2][0] = 279; // Score in year 2010 (year 2) for India (team 0)
        scores[2][1] = 260; // Score in year 2010 (year 2) for Pakistan (team 1)
        scores[2][2] = 250; // Score in year 2010 (year 2) for Australia (team 2)
        scores[2][3] = 274; // Score in year 2010 (year 2) for Srilanka (team 3)
        
        for (int i=0;i<3;i++)
        {
        	for (int j=0;j<4;j++)
        	{
        		System.out.println("Scores "+ scores[i][j]);
        	}
        }
        System.out.println("enhanced for loop in array");
        for (int[] i :scores)
        {
        	for(int j : i)
        	System.out.println("2-D array using enhanced for loop: "+ j);
        }
	}

}
