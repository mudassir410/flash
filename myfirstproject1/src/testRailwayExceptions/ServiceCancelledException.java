package testRailwayExceptions;

public class ServiceCancelledException extends RailwayException
{
	String date;
	 ServiceCancelledException(int trainNo, String date)
	 {
	 super(trainNo, "The service of train " + trainNo + " is cancelled on " + date);
	 this.date = date;
	 }
}
