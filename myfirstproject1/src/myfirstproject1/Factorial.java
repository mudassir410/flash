package myfirstproject1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter a number");
		int n = reader.nextInt();
		double
		fact = 1;
		System.out.println("reader input"+n);
		for (int i=1; i<=n; i++)
		{
		 fact*=i;
		 System.out.println("i="+i+" fact = "+fact);
		/* if (i==n)
			 System.out.print(i);
		 else
		 System.out.print(i+"*");*/
		}
		System.out.println("Factorial of " +n+" = " +fact);
			
    }

}
