package innerClassPackage;

import innerClassPackage.InnerClassConcept.Inner;

public class StaticNestedClass 
{
	private int a=100;
	public void display()
	{
		System.out.println(a);
	}
	
	class Inner // Member Inner class
	{
		void access()
		{
			System.out.println(a);
		}
	}	   
	
	public static void main(String[] args)
	{
//		InnerClassConcept oc = new InnerClassConcept();
		oc.display();
		oc.a = 45;
		InnerClassConcept.Inner in = oc.new Inner();
		in.access();
	}

}
