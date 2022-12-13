package inheritancePackage;

class Address
{
	String city;
	String state;
	String country;
	public Address(String city, String state, String country) 
	{
		this.city=city;
		this.state=state;
		this.country=country;
	}
}

class Student
{
	int id;
	String name;
	int age;
	Address add; // re-usable of address
	public Student(int id, String name, int age, Address add) 
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.add=add;
	}

public void display()
{
	System.out.println("My name is: "+name + " ID is:"+id+ " of Age "+age+ " and I am from "+add.city+", "+","+add.state+", "+add.country+".");
}

}
//Aggregation has "has a " relation.
public class Aggregation 
{
	public static void main(String[] args) 
	{
		Address add= new Address("Kathmandu", "Bagmati", "Nepal");
		Student st1= new Student(1, "Deep", 21, add);
		st1.display();
	}
}
