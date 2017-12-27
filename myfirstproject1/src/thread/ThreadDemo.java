package thread;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread threadOne = new Thread();
		System.out.println("Default Name: "+threadOne.getName());
		System.out.println("Default Priority: "+threadOne.getPriority()+"\n");
		
		 threadOne.setName("threadOne"); 
		 threadOne.setPriority(1);
		 
		 threadOne.setName("ThreadFirst");
		 threadOne.setPriority(10);
		 
		 System.out.println("Current Name: " + threadOne.getName());
		 System.out.println("Current Priority: " + threadOne.getPriority() + "\n ");

		 System.out.println("ThreadID: " + threadOne.getId()); //returns unique Id
		 System.out.println("threadOne isAlive: " + threadOne.isAlive() +"\n ");
		 
		 ClassImplementsRunnable td = new ClassImplementsRunnable();
		 Thread runthread = new Thread(td, "runthread");
		 Thread newthread = new Thread(td, "newthread");
		 newthread.start();
		 runthread.start();

	}

}
class ClassImplementsRunnable implements Runnable
{
	public void run(){
		System.out.println("iam running");
	}
}