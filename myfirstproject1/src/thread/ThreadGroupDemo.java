package thread;

public class ThreadGroupDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroup readingThreads = new ThreadGroup("ReadingThreadGroup");
		for(int i=1;i<=3;i++)
		{
			A thread = new A(readingThreads, "Thread-"+i);
			thread.start();
		}
		ThreadGroup writingThreads = new ThreadGroup("WritingThreadGroup");
		for(int i=4;i<=9;i++)
		{
			B thread = new B(writingThreads, "Thread-" + i);
			thread.start();
		}
		ThreadGroup coordinatingThreads = new ThreadGroup("coordinatingThreadGroup");
		for(int i=10;i<=15;i++)
		{
			B thread = new B(coordinatingThreads, "Thread-" + i);
			thread.start();
		}
	}

}
class A extends Thread 
{
	A(ThreadGroup tg, String name)
	{
		super(tg,name);
	}
	public void run()
	{
		System.out.println("I am " + Thread.currentThread().getName() + " I belong to " + Thread.currentThread().getThreadGroup().getName());
		System.out.println("Iam running");
	}
}
class B extends Thread
{
	B(ThreadGroup tg, String name)
	{
		super(tg, name);
	}
	public void run()
	{
		System.out.println("I am " + Thread.currentThread().getName() + " I belong to " + Thread.currentThread().getThreadGroup().getName());
		System.out.println("Iam running");
	}
}