package concurrencyPackage;
// java.lang is a implicitly package which is automatically derived.
public class ThreadPriority extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Thread Name: "+currentThread().getName());
		System.out.println("Priority Number: "+currentThread().getPriority());
	}
	public static void main(String[] args) 
	{
		ThreadPriority t0 = new ThreadPriority();
		ThreadPriority t1 = new ThreadPriority();
		ThreadPriority t2 = new ThreadPriority();
		ThreadPriority t3 = new ThreadPriority();
		ThreadPriority t4 = new ThreadPriority();
		t0.setPriority(MIN_PRIORITY); // 1
		t1.setPriority(3);  //3
		t2.setPriority(MAX_PRIORITY); //10
		t3.setPriority(NORM_PRIORITY); // 5
		t4.setPriority(8); //8
		t0.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
