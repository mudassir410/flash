package testRailwayExceptions;

public class RailwayException extends Exception
{
	int trainNo;
	 String errorMessage;

	 RailwayException(int trainNo, String errorMessage)
	 {
	 this.trainNo = trainNo;
	 this.errorMessage = errorMessage;
	 }
	 String getErrorMessage()
	 {
	 return errorMessage;
	 }
}
