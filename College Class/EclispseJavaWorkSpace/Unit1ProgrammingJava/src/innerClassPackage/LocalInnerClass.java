package innerClassPackage;

class Outer
{
	int a = 35;
	void display() 
	{
		class inner // Local class of inner display method
		{
			void print() 
			{
				System.out.println("Value of a = "+ a);
			}
		}
		inner in = new inner();
		in.print();
	};
	
	
}
public class LocalInnerClass 
{

	public static void main(String[] args) 
	{
		Outer out = new Outer(); // outer class will make local inner class object
		out.display();
	}

}
