
public class ConceptofClass 
{
/*
Types of Variables
1. Instance Variable or Non-Static Variables:
The variables those require object or instance to be accessed.

2. Static or Class Variables:
The variables those do not require object or instance to be accessed.

 */

	int num =20;
	
	static int num1 = 30; // Static class variable
	
	void method()
	{
		
	}
	
	static void method1()
	{
		
	}
	
	public static void main(String[] args) 
	{
		ConceptofClass newnum = new ConceptofClass();
		System.out.println("The number is: "+ newnum.num); // instance type variable access
		System.out.println("The number 1 is: "+ num1); // static class variable class
		newnum.method(); // Non static method
		method1(); // Static method		
	}

}
