
class Shape
{
	private int length, breadth;
	float radius;
	// Method Overloading --> Compile Time
	
	
	
	public void SetData(int length)
	{
		this.length = this.breadth= length;
	}
	
	public void setData(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	public void setData(float radius)
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
public class MethodAndConstructorOverloading 
{

	public static void main(String[] args) 
	{
		Shape shape = new Shape();
		shape.setData(3,4);
		System.out.println("Area of Rectangle: "+ shape.area());
		shape.setData(5);
		System.out.println("Area of Square: "+ shape.area());
		shape.setData(21.5f);
		System.out.println("Area of Circle: "+ shape.areaC());
		
	}

}
