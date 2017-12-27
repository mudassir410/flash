package myfirstproject1;

public class CalculateSimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principle = 1000;
		double time = 5;
		double rate = 10.25;
		double interest = calculateInterest(principle,time,rate);
		printInterest(interest,principle,time,rate);
		
	}
	public static double calculateInterest(double principle, double time, double rate)
	{
	double interest = (principle+time+rate)/100;
	return interest;
}
	public static void printInterest(double interest,double principle,double time, double rate)
	{
		System.out.println("the interest for the principle amount " + principle + "for duration " + time + "@ "+ rate +"="+ interest);
	}
}
       
        