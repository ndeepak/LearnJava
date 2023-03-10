package quesSeven;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectFromStudent {

	public static void main(String[] args) throws ClassNotFoundException {
		FileInputStream fi = null;
		ObjectInputStream oi = null;

		try {
			fi = new FileInputStream(
					"student.txt");
			oi = new ObjectInputStream(fi);
			Student s1 = (Student) oi.readObject(); // Type Casting
			Student s2 = (Student) oi.readObject();

			System.out.println("Student s1: " + s1.toString());
			System.out.println("Student s2: " + s2.toString());

//			fi.close();
//			oi.close();
		} catch (IOException ex) {

		}

	}

}
