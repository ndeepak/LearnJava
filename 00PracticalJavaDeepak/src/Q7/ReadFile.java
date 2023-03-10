import java.io.*;

class ReadFile{
	public static void main(String[] args) throws Exception{
		File file = new File("student.txt");
			
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		Student s1 = (Student)ois.readObject();
		ois.close();
		
		System.out.println(s1);
	}
}