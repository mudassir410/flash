package myfirstproject1;

public class FibonacciSeriesUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int febCount = 10;
        int[] feb = new int[febCount];
        feb[0] = 0;
        feb[1] = 1;
        System.out.println("Fibonacci series");
        for(int i=2; i < febCount; i++)
        {
            feb[i] = feb[i-1] + feb[i-2];
        }

        for(int i=0; i< febCount; i++)
        {
                System.out.println(feb[i]+" ");
        }*/
		System.out.println("fibonacci series");
		System.out.print("0 1 ");
		fibo(0, 1, 10, 2);
	}

	public static void fibo(int i, int j, int index, int count)
	{
		if(count<index)
		{
		int newnumber = i+j;
		System.out.print(newnumber + " ");
		fibo(j, newnumber, index, ++count);
	}
}
}