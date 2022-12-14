//1. Using thread class
//class A extends threads
//2. Using runnable interface
//class A implements Runnable
package concurrencyPackage;
class Good1 extends Thread
{
	@Override
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("GOOD");
			try
			{
				Thread.sleep(1000); // 1 second
			}
			catch(InterruptedException e)
			{
				
			}
		}
	}
}


class Morning1 extends Thread
{
	@Override
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("MORNING");
			try
			{
				Thread.sleep(1000); // 1 second
			}
			catch(InterruptedException e)
			{
				
			}
		}
	}
}
public class WithMultithreading 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		Good1 g = new Good1();
		g.start();
		Morning1 m = new Morning1();
		m.start();
	}

}
