import java.io.*;
public class RandomIO 
{
	public static void main(String[] args) 
	{
		try
		{
			RandomAccessFile file = new
			RandomAccessFile("C:\\Users\\haren\\Desktop\\test.txt","rw");
			//Writing to the file
			file.writeChars("X");
			file.writeInt(100);
			file.writeDouble(3.1424);
			file.seek(0);
			//Reading from the file
			System.out.println(file.readChar());
			System.out.println(file.readInt());
			System.out.println(file.readDouble());
			file.seek(2); //got to the second line
			System.out.println(file.readInt());
			//go to the end and append false to the file
			file.seek(file.length());
			file.writeBoolean(false);
			file.seek(4);
			System.out.println(file.readBoolean());
			file.close();
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
	}
}
public class ReadFileMain 
{
	public static void main(String[] args) 
	{
		ReadFile file = new ReadFile();
		file.OpenFile();
		file.ReadFile();
		file.CloseFile();
	}
}