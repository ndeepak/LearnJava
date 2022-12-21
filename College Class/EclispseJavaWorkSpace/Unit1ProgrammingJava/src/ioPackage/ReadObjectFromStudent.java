package ioPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectFromStudent 
{

	public static void main(String[] args) throws ClassNotFoundException
	{
		FileInputStream fi = null;
		ObjectInputStream oi = null;
		
		try
		{
			fi = new FileInputStream("E:\\01 Learn Java\\LearnJava\\College Class\\EclispseJavaWorkSpace\\Unit1ProgrammingJava\\src\\ioPackage\\JavaFiles\\objectfile.txt");
			oi = new ObjectInputStream(fi);
			Student s1 = (Student) oi.readObject(); // Type Casting
			Student s2 = (Student) oi.readObject();
			
			System.out.println("Student s1: "+ s1.toString());
			System.out.println("Student s2: "+ s2.toString());
			
//			fi.close();
//			oi.close();
		}
		catch(IOException ex)
		{
			
		}
				
	}

}
