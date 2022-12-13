package packageOne;

public class SamePackageSubClass extends ProtectionLevel
{
	public SamePackageSubClass() 
	{
		System.out.println("**** Protection Level in Same Package Sub Class ****");
		System.out.println("Default Number: "+num);
//		System.out.println("Private Number: "+numpri); // Not Accessible 
		System.out.println("Protected Number: "+numpro);
		System.out.println("Public Number: "+numpub);
	}

	public static void main(String[] args) 
	{
		new SamePackageSubClass();
	}

}
