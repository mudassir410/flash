package testRailwayExceptions;

public class TestRailwayExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		 {
		 String travel_date = "21/12/2012";
		 TicketBooker ticketBooker = new TicketBooker();
		 ticketBooker.bookTicket(17023, travel_date, 3, 1);
		 System.out.println("Tickets booked successfully.");
		 }
		 
		catch(SeatsNotAvailableException snae)
		{
			System.out.println("Seats are not Available. Reason : "+snae.getErrorMessage());
		}
		catch(ServiceCancelledException sce)
		{ 
			System.out.println("Service is Cancelled. Reason :  "+sce.getErrorMessage());
		}
		catch(RailwayException re)
		 {
		 System.out.println("Railway booking failed. Reason : " + re.getErrorMessage());
		 }
	}

}
