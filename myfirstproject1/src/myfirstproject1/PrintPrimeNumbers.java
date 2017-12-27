package myfirstproject1;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
         for(int i=1; i < 50; i++)
         {
                
                 boolean Prime = true;
                
                 for(int j=2; j < i ; j++)
                 {
                        
                         if(i % j == 0)
                         {
                                 Prime = false;
                                 break;
                         }
                 }
                 if(Prime)
                         System.out.print(" "+i);
         }
	}

}
