package thread;

public class SimpleThread extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleThread st = new SimpleThread();
        st.start();
        Thread t2 = new SimpleThread();
        t2.start();
    }
    
    public void run()
    {
        System.out.println("Thread running...");
	}

}
