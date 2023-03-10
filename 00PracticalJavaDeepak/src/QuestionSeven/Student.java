package quesSeven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {
	private String name;
	private int age;
	private String gender;

	Student(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String toString() {
		return "Name: " + name + ", Age: " + age + ", Gender: " + gender;
	}
}

class WriteToFile {
	public static void main(String[] args) {
		Student s1 = new Student("harendra", 18, "Male");
		Student s2 = new Student("Surendra", 20, "Male");
		File file = new File("harendra.txt");
		try {
			FileOutputStream f = new FileOutputStream(file);
			ObjectOutputStream o = new ObjectOutputStream(f);
			// writing objects to a file
			o.writeObject(s1);
			o.writeObject(s2);
			o.close();
			f.close();
			System.out.println("Objects written to file successfully");
			// reading objects from a file
			FileInputStream fi = new FileInputStream(file);
			ObjectInputStream oi = new ObjectInputStream(fi);
			// Read objects
			Student st1 = (Student) oi.readObject();
			Student st2 = (Student) oi.readObject();
			System.out.println("Student 1 -" + st1.toString());
			System.out.println("Student 2 -" + st2.toString());
			fi.close();
			oi.close();
		} catch (Exception ex) {
		}
	}
}