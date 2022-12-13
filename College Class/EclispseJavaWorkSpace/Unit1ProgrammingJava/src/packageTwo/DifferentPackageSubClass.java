package packageTwo;

import packageOne.ProtectionLevel;
public class DifferentPackageSubClass extends ProtectionLevel
{
	public DifferentPackageSubClass() 
	{
		System.out.println("**** Protection Level in Different Package Sub Class ****");
//		System.out.println("Default Number: "+num); // Not Accessible
//		System.out.println("Private Number: "+numpri); // Not Accesible 
		System.out.println("Protected Number: "+numpro);
		System.out.println("Public Number: "+numpub);
	}
	public static void main(String[] args) 
	{
		new DifferentPackageSubClass();
	}

}
