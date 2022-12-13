package packageOne;

public class ProtectionLevel 
{
	int num = 20; // Default Modifier
	private int numpri = 30; // Private Modifier
	protected int numpro = 40; // Protected Modifier
	public int numpub = 50; // Public Modifier
	
	public ProtectionLevel() 
	{
		System.out.println("**** Protection Level in Same Class ****");
		System.out.println("Default Number: "+num);
		System.out.println("Private Number: "+numpri);
		System.out.println("Protected Number: "+numpro);
		System.out.println("Public Number: "+numpub);
	}
	
	
	public static void main(String[] args) 
	{
		new ProtectionLevel();
	}

}
