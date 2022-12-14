package concurrencyPackage;

public class Yield1 extends Thread
{
	@Override
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println(Thread.currentThread().getName()+ " in control.");
		}
	}
	public static void main(String[] args) 
	{
		Yield1 y = new Yield1();
		y.start();
		Thread.yield();
		for(int i=0; i<5; i++)
		{
			System.out.println(Thread.currentThread().getName() + " in control.");
		}
	}

}
