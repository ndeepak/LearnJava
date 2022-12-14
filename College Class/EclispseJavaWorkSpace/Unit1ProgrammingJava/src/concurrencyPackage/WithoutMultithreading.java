//1. Using thread class
//class A extends threads
//2. Using runnable interface
//class A implements Runnable
package concurrencyPackage;
class Good
{
	void display() throws InterruptedException
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("GOOD");
			Thread.sleep(1000); // 1 second
		}
	}
}


class Morning
{
	void display() throws InterruptedException
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("MORNING !!!");
			Thread.sleep(1000); // 1 second
		}
	}
}
public class WithoutMultithreading 
{
	
	public static void main(String[] args)  throws InterruptedException
	{
		Good g = new Good();
		Morning m = new Morning();
		g.display();
		m.display();
	}

}
