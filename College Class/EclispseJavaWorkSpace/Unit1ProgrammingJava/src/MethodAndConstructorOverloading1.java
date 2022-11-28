// Constructor Overloading --> Runtime Overloading

class Shapes
{
	private int length, breadth;
	float radius;
	// Method Overloading --> Compile Time
	
	
	
	public Shapes(int length)
	{
		this.length = this.breadth= length;
	}
	
	public  Shapes(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	public Shapes(float radius)
	{
		this.radius = radius;
	}
	
	public int area()
	{
		return length*breadth;
	}
	
	public float areaC() {
		return (float)Math.PI * radius * radius;
	}
}
public class MethodAndConstructorOverloading1
{

	public static void main(String[] args) 
	{
		Shapes rect = new Shapes(5, 5); // Calls Constructor having 1 argument
		System.out.println("Area of Rectangle: "+ rect.area());
		
		Shapes square = new Shapes(6);
		System.out.println("Area of Square: "+ square.area());

		Shapes circle = new Shapes(122.434f);
		System.out.println("Area of Circle: "+ circle.areaC());
		
	}

}
