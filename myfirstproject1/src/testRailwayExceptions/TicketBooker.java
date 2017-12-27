package testRailwayExceptions;

public class TicketBooker 
{
	public void bookTicket(int trainNo, String date, int adults, int children)
			 throws RailwayException // LINE A
			 {
			 if(isServiceCancelled(trainNo, date))
			 {
			 throw new ServiceCancelledException(trainNo, date); // LINE B
			 }
			 if(areSeatsAvailable(trainNo, date, adults, children))
			 {
			 confirmBooking(trainNo, date, adults, children);
			 
			 if(isCounterClosedException(trainNo, date))
			 {
				 throw new CounterClosedException(trainNo, date);
			 }
			 }
			 else
			 {
			 throw new SeatsNotAvailableException(trainNo, date); // LINE C
			 }
			 }
			 private boolean isServiceCancelled(int trainNo, String date)
			 {
			 // Code for checking if the service is cancelled
			 return true; // LINE D
			 }
			 private boolean areSeatsAvailable(int trainNo, String date, int adults, int children)
			 {
			 // Code here for checking if the seats are available
			 return true; // LINE E
			 }
			 private boolean isCounterClosedException(int trainNo, String date)
			 {
				 return false;
			 }
			 private void confirmBooking(int trainNo, String date, int adults, int children)
			 {
			 // code here to confirm the booking
			 }
}
