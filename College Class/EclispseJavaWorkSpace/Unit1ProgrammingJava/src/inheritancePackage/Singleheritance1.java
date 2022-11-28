package inheritancePackage;

class Room
{
	int length, breadth;
	public Room(int length, int breadth) // Constructor for initialization and Memory allocation
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	int area()
	{
		return length*breadth;
	}
}

class BedRoom extends Room
{
	int height;
	public BedRoom(int lenght, int breadth, int height)
	{
		super(lenght, breadth); // Calls the Base Constructor
		this.height = height;
	}
	
	int volume()
	{
		return length*breadth*height;
	}
}

public class Singleheritance1 
{
	public static void main(String args[])
	{
		BedRoom r1 = new BedRoom(10, 20, 30 );
//		r1.length = 10; // No need for initialization as constructor is made.
//		r1.breadth = 20;
//		r1.height = 30;
		System.out.println("Area is: "+ r1.area());
		System.out.println("Volume is: "+ r1.volume());
	}
}
