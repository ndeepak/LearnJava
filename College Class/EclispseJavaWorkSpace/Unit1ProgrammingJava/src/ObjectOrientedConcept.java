
public class ObjectOrientedConcept 
{
//Declaring Variables
	int i;
	float f;
	double d;
	
// Defining Methods
	void method1() // Null Method
	{
		
	}
	
	int method2() // Return type method
	{
		return 0;
	}
	
	void add(int a, int b) // Parameterized Method
	{
		
	}
	
	int mul(int d, int e)
	{
		return d*e;
	}
	
	public static void main(String[] args) 
	{
		// Object Creation
		ObjectOrientedConcept ooc = new ObjectOrientedConcept();  // Reference (No memory allocated)
		// OOC is a instance or object
		
		// Accessing variables or methods
		ooc.i = 24;
		ooc.f = 234.567f;
		ooc.d =  22342.23423423d;
		System.out.println(ooc.mul(3,4));
		
		
		
		
	}

}
