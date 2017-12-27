package testRailwayExceptions;

public class SeatsNotAvailableException extends RailwayException
{
		 String date;
		 
		 SeatsNotAvailableException(int trainNo, String date)
		 {
		 super(trainNo, "There are no seats available for the train " + trainNo + " on " + date);
		 this.date = date;
		 }
}
