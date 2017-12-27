package testRailwayExceptions;

public class CounterClosedException extends RailwayException 
{
	String date;
	 CounterClosedException(int trainNo, String date)
	 {
	 super(trainNo, "The service of train " + trainNo + " is cancelled on " + date);
	 this.date = date;
}
}
