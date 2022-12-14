package concurrencyPackage;
class Hi implements Runnable
{
	@Override
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("Hi");
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

class Hello implements Runnable
{
	@Override
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("HELLO");
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
public class UsingRunnableInterface 
{
	public static void main(String[] args) 
	{
		Hi h = new Hi(); // This is not a thread
		Thread t1 = new Thread(h);
		Hello he = new Hello();
		Thread t2 = new Thread(he);
		t1.start();
		t2.start();
	}
}
