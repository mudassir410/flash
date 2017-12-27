package myfirstproject1;

public class PrintOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		while (i < 5)
		{
		    System.out.println("value of i: " + i);
		    i++;
		    if (true)
		        continue; // LINE A    
		    System.out.println("value after continue: " + i); // LINE B
		}
	}

}
