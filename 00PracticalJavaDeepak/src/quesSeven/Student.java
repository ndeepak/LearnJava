package quesSeven;

import java.io.Serializable;

// Serializable converts Student objects to bytestream for writing and reading purpose
public class Student implements Serializable
{
	int id;
	String name;
	int age;
	
	public Student(int id, String name, int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public String toString() 
	{
		return "My name is "+name+ " of age "+age+ " with ID no. "+id;
	}

}
