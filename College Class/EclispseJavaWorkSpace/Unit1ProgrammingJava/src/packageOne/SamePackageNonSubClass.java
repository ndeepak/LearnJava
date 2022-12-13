package packageOne;

public class SamePackageNonSubClass 
{
	public SamePackageNonSubClass() 
	{
		ProtectionLevel p = new ProtectionLevel();
		System.out.println("**** Protection Level in Same Package Non Sub Class ****");
		System.out.println("Default Number: "+p.num);
//		System.out.println("Private Number: "+p.numpri); // Not Accessible
		System.out.println("Protected Number: "+p.numpro);
		System.out.println("Public Number: "+p.numpub);
	}
	public static void main(String[] args) 
	{
		new SamePackageNonSubClass();
	}

}
