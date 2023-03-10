package quesSeven;
import quesSeven.Student;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjToFileStudent 
{

	public static void main(String[] args) throws IOException 
	{
		FileOutputStream fo = null;
		ObjectOutputStream oo = null;
		Student s1 = new Student(1, "Deep", 21);
		Student s2 = new Student(2, "Jeep", 31);
		File file = new File("student.txt");
		
		
		try
		{
			fo = new FileOutputStream(file);
			oo = new ObjectOutputStream(fo);
			
			oo.writeObject(s1);
			oo.writeObject(s2);
			
		}
		catch(IOException e)
		{
			fo.close();
			oo.close();
		}
	}

}
