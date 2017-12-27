package myfirstproject1;

public class PrintProductCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number1 = 7;
	        int number2 = 4;
	        outer : for (int i = 2; i <= number1; i++) // first for loop 
	        {
	            for (int k = 2; k <= number2; k++) // second for loop
	            {
	                int product = i * k;
	                if (product > 15) // LINE A
	                    break outer; // LINE B
	                System.out.println(i + " x " + k + " = " + product);
	            }
	        }    

	}

}
