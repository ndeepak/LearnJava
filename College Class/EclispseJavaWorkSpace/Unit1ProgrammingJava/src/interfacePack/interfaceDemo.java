package interfacePack;

//private/public/proctected interface first
interface First // Default modifier
{
	int a = 12; // Initialized (Must) 
	void method(); 					// by default public abstract  
	public abstract void method1(); // not have body
}

interface Second extends First
{
	void display();
}

class A
{
	
}

public enum interfaceDemo extends A implements Second 
{
	public static void main(String[] args)
	{
		System.out.println(a);
		First f;  // reference is okay
//		a=25;  // final variables can not be over-ride
//		f = new First(); // Invalid (Instantiation 
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
}
