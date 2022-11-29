package innerClassPackage;

abstract public class Anonymous 
{
	abstract void display(); // Signature
	
	public static void main(String[] args) 
	{
		Anonymous ac =  new Anonymous() 
		{
			@Override
			void display() 
			{
				System.out.println("Hello World!!! ");
			}
		};
		
		ac.display();
	}

}
