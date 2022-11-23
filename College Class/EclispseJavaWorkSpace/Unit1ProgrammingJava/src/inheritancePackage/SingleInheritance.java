package inheritancePackage; // User-defined package import

abstract class Employee  // Base/Parent/Super Class with abstract (hidden)
{
	int id;
	String name;
	float salary;
}

class Developer extends Employee // Derived/Child//Sup Class
{
	float bonus;
	void display()
	{
		System.out.println("Id is "+ id);
		System.out.println("Name is " + name);
		System.out.println("Total Salary = "+ (salary + bonus));
//		System.out.println("Bonus = "+ id);
		
	}
}

public class SingleInheritance 
{

	public static void main(String[] args) 
	{
//		Employee e1 = new Employee(); // Due to abstract hidden class
		Developer dev1 = new Developer(); 
		dev1.id = 1011;
		dev1.name = "Ram Shah";
		dev1.salary = 200000.123f;
		dev1.bonus = 10000.1223f;
		
		dev1.display();
	}

}
