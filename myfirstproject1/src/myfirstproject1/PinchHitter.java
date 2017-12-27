package myfirstproject1;

	class PinchHitter implements Runnable
	{
	String hitterName;
	Thread t;
	boolean takeRest;
	PinchHitter(String hitterName)
	{
	this.hitterName = hitterName;
	t = new Thread(this, hitterName);
	System.out.println("Pinch Hitter Padded up and ready: " + t);
	takeRest = false;
	t.start();
	}
	public void run()
	{
		try
		{
			for(int i = 0; i < 10; i++)
			{
				System.out.println(hitterName + " : " + i);
				Thread.sleep(200);
				synchronized(this)
				{
				while(takeRest)
				{
					wait(1000);
				}
				}
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(hitterName + " interrupted.");
		}
		System.out.println(hitterName + " done hitting.");
	}
	synchronized void stopHitting()
	{
	takeRest = true;
	}
	synchronized void startHitting()
	{
	takeRest = false;
	notify();
}
}

