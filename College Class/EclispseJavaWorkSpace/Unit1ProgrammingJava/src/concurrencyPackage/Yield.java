package concurrencyPackage;
public class Yield extends Thread 
{ // Thread-0
	@Override
	public void run() 
	{
		Thread.yield(); // if we want execute main thread and stop thread-0.
		for (int i = 0; i < 3; i++)
			System.out.println(Thread.currentThread().getName() + " in control");
	}

	public static void main(String[] args) 
	{ // main thread
		Yield t1 = new Yield();
		t1.start();
		// Thread.yield(); //if we want to stop main thread and give chance to execute
		// other threads
		for (int i = 0; i < 3; i++) 
		{
			// Control passes to child thread
			System.out.println(Thread.currentThread().getName() + " in under control");
		}
	}
}