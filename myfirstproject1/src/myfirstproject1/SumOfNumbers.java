package myfirstproject1;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 4;
int s = 0;
for (int i=0; i<=n; i++)
{
 s+=i;
 if (i==n)
	 System.out.print(i);
 else
 System.out.print(i+"+");
}
System.out.println("="+s);
	
	}

}
