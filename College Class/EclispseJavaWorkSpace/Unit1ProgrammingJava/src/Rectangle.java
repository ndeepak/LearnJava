
public class Rectangle 
{

	int length, breadth; // Instance variable
	
	void getParameters(int length, int breadth) // Method with no return type
	{
		this.length = length; // Instance variable initialize
		this.breadth= breadth; // Instance variable initialize
		// this. (class reference) removes ambiguity in class.
	}
	
	int getArea() // Method with return type
	{
		return length*breadth;
	}
	
	public static void main(String[] args) 
	{
		Rectangle rec1 = new Rectangle(); // Object of Rectangle
		
		// Using initializing instance variables
		rec1.length = 5;
		rec1.breadth = 10;
		System.out.println(rec1.getArea());
		
		// Using Method 
		Rectangle rec2 = new Rectangle();
		rec2.getParameters(3, 4);
		System.out.println(rec2.getArea());
	}

}
