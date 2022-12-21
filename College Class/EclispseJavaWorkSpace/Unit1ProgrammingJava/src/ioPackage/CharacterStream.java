package ioPackage;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream 
{
	FileReader in = null;
	FileWriter out = null;
	
	public CharacterStream() throws IOException
	{
		try
		{
			in = new FileReader("E:\\01 Learn Java\\LearnJava\\College Class\\EclispseJavaWorkSpace\\Unit1ProgrammingJava\\src\\ioPackage\\JavaFiles\\input1.txt");
			out = new FileWriter("E:\\01 Learn Java\\LearnJava\\College Class\\EclispseJavaWorkSpace\\Unit1ProgrammingJava\\src\\ioPackage\\JavaFiles\\output1.txt");
			int ch;
			while((ch=in.read()) != -1)
			{
				out.write(ch);
				System.out.println(ch);
			}
		}
		catch(IOException ex)
		{
			
		}
		finally
		{
			in.close();
			out.close();
		}
	}
			
			
	public static void main(String[] args) throws IOException
	{
		new CharacterStream();
	}

}
