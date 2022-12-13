package packageTwo;

import packageOne.ProtectionLevel;
public class DifferentPackageNonSubClass 
{
	public DifferentPackageNonSubClass() 
	{
		System.out.println("**** Protection Level in Different Package Non Sub Class ****");
		ProtectionLevel p = new ProtectionLevel();
		
		// Not Accessible in Default, Private, Protected.
//		System.out.println("Default Number: "+p.num);
//		System.out.println("Private Number: "+p.numpri);
//		System.out.println("Protected Number: "+p.numpro);
		System.out.println("Public Number: "+p.numpub);
	}
	public static void main(String[] args) 
	{
		new DifferentPackageNonSubClass();
	}

}
