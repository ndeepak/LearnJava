package inheritancePackage;

// Two level inheritance 

abstract class Car
{
	final int wheels = 4; // fixed value
	public Car()
	{
		System.out.println("Car Constructor ");
	}
	
	public void VehicleType()
	{
		System.out.println("Type: Car");
	}
}

abstract class Maruti extends Car // Sub Class of Car class
{
	public Maruti() 
	{
		System.out.println("Maruti Constructor");
	}
	public void brand()
	{
		System.out.println("Brand: Maruti Suzuki");
	}
	
	public void speed()
	{
		System.out.println("Speed: 29 KM/Hr");
	}
}

class Maruti800 extends Maruti // Sub class of Maruti
{
	public Maruti800()
	{
		System.out.println("Maruti800 Constructor");
	}
	@Override
	public void speed()
	{
		System.out.println("Speed: 31 KM/Hr");
	}
}

public class MultiLevelInheritance 
{

	public static void main(String[] args) 
	{
		Maruti800 m8001 = new Maruti800();
		m8001.VehicleType();
		m8001.brand();
		m8001.speed(); // Calls Overridden Method
		System.out.println("Number of wheels = " + m8001.wheels);
	}

}
