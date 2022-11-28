package inheritancePackage;

class Animal
{
	int legs=4;
	public void eat()
	{
		System.out.println("Eating Everyday!!!");
	}
}

class Dog extends Animal
{
	public void bark()
	{
		System.out.println("I bark loudly!!!");
	}
}

class Cat extends Animal
{
	public void meow()
	{
		System.out.println("I Meow Slowly!!! ");
	}
}

public class HierarchicalInheritance 
{

	public static void main(String[] args) 
	{
		
		Cat c = new Cat();
		System.out.println("CAT calling function.");
		c.meow();
		c.eat();
		System.out.println("I (Cat)  have "+ c.legs + "Legs.\n");

		System.out.println("DOG calling function.");
		Dog d = new Dog();
		d.bark();
		d.eat();
		System.out.println("I (Dog)  have "+ d.legs+ "Legs.");
	}

}
