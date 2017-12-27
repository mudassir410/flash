package myfirstproject1;

public class SeatReservation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reservation reserve = new Reservation();
		Person thread1 = new Person(reserve, 5);
		thread1.setPriority(1);
		thread1.start();
		Person thread2 = new Person(reserve, 4);
		thread2.setPriority(5);
		thread2.start();
		Person thread3 = new Person(reserve, 2);
		thread3.setPriority(3);
		thread3.start();
		Person thread4 = new Person(reserve,1);
		thread4.setPriority(4);
		thread4.start();

	}

}
class Reservation
{
	static int availableSeats = 10;
	
	 synchronized void reserveSeat(int requestedSeats)
	{
		System.out.println(Thread.currentThread().getName()+" entered");
		System.out.println("Availableseats : " + availableSeats + " Requestedsetas : " + requestedSeats);
		if (availableSeats >= requestedSeats)
		{
			System.out.println("seats avaialable reserve now");
			try
			{
				Thread.sleep(100);
			}
			catch (InterruptedException e)
			{
				System.out.println("Thread interrupted");
			}
			System.out.println(requestedSeats + " seats reserved."); 
			availableSeats = availableSeats - requestedSeats;
		}
		else
		{
			System.out.println("requested seats not available");
		}
		System.out.println(Thread.currentThread().getName() + " leaving."); 
		System.out.println("----------------------------------------------");
	}
	
}
class Person extends Thread
{
	Reservation reserve;
	int requestedSeats;
	
	public Person(Reservation reserve, int requestedSeats)
	{
		this.reserve = reserve;
		this.requestedSeats = requestedSeats;
	}
	
	public void run()
	{
		reserve.reserveSeat(requestedSeats);
	}
}
