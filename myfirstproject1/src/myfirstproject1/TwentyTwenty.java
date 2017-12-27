package myfirstproject1;

public class TwentyTwenty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PinchHitter dhoni = new PinchHitter("Dhoni");
		PinchHitter yuvi = new PinchHitter("Yuvi");
		try
		{
		Thread.sleep(1000);
		dhoni.stopHitting();
		System.out.println("Dhoni Hitting Stopped");
		Thread.sleep(1000);
		dhoni.startHitting();
		System.out.println("Dhoni Hitting Started");
		yuvi.stopHitting();
		System.out.println("Yuvi Hitting Stopped");
		Thread.sleep(1000);
		yuvi.startHitting();
		System.out.println("Yuvi Hitting Started");
		}
		catch(InterruptedException e)
		{
		System.out.println("Twenty Twenty cancelled");
		}
		try
		{
		System.out.println("Waiting for match to finish");
		dhoni.t.join();
		yuvi.t.join();
		}
		catch(InterruptedException e)
		{
		System.out.println("Twenty Twenty cancelled");
		}
		System.out.println("Twenty Twenty Innings Completed.");
		}
}