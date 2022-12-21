import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferStream 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader inputStream = null;
		BufferedWriter outputStream = null;
		try 
		{
			inputStream = new BufferedReader(new FileReader("E:\\01 Learn Java\\LearnJava\\College Class\\EclispseJavaWorkSpace\\Unit1ProgrammingJava\\src\\ioPackage\\JavaFiles\\input2.txt"));
			outputStream = new BufferedWriter(new FileWriter("E:\\01 Learn Java\\LearnJava\\College Class\\EclispseJavaWorkSpace\\Unit1ProgrammingJava\\src\\ioPackage\\JavaFiles\\output2.txt"));
			int c;
			while ((c = inputStream.read()) != -1) 
			{
				outputStream.write(c);
			}
		} 
		finally 
		{
			if (inputStream != null) 
			{
				inputStream.close();
			}
			if (outputStream != null) 
			{
				outputStream.close();
			}
		}
	}
}
