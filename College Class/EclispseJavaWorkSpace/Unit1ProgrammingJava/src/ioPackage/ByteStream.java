package ioPackage;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class ByteStream 
{
	FileInputStream input = null;
	FileOutputStream output = null;
	
	public ByteStream() throws IOException
	{
		input = new FileInputStream("E:\\01 Learn Java\\LearnJava\\College Class\\EclispseJavaWorkSpace\\Unit1ProgrammingJava\\src\\ioPackage\\JavaFiles\\input.txt"); // Read File
		output = new FileOutputStream("E:\\01 Learn Java\\LearnJava\\College Class\\EclispseJavaWorkSpace\\Unit1ProgrammingJava\\src\\ioPackage\\JavaFiles\\output.txt"); // output the input text
		int ch;
		while((ch=input.read()) != -1) // -1 is end of the file
		{
			output.write(ch);
		}
	}
	
	
	public static void main(String[] args) throws IOException
	{
		new ByteStream();
	}

}
