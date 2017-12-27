package myfirstproject1;

public class InterThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Customer c = new Customer();
		new Thread()
		{
			public void run()
			{
				c.withdraw(15000);
			}
		}.start();
		new Thread()
		{
			public void run()
			{
				c.deposit(10000);
			}
		}.start();
		new Thread()
		{
			public void run()
			{
				c.deposit(10000);
			}
		}.start();
		new Thread()
		{
			public void run()
			{
				c.withdraw(15000);
			}
		}.start();
		new Thread()
		{
			public void run()
			{
				c.deposit(5000);
			}
		}.start();
	}

}
class Customer
{
	int amount = 10000;
	
	synchronized void withdraw(int amount)
	{
		System.out.println("Available Balance "+this.amount);
		System.out.println("Going to withdraw "+amount);
		
		if(this.amount<amount)
		{
			System.out.println("Insufficient balance waiting for deposit ");
			try
			{
				wait();
			}catch(Exception e)
			{
				System.out.println("Interrupt occured");
			}
		}
		this.amount -= amount;
		System.out.println("deducted amount: "+amount);
		System.out.println("balance amount: "+this.amount);
	}
synchronized void deposit(int amount)
{
	System.out.println("going to deposit "+amount);
	this.amount +=amount;
	System.out.println("Available balance "+this.amount);
	System.out.println("transaction completed \n");
	notify();
}
}