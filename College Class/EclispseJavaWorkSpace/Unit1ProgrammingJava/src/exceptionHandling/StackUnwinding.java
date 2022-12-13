package exceptionHandling;
import java.util.Scanner;

public class StackUnwinding 
{

	public static void main(String[] args) 
	{
		try
		{
			throwException();
		}
		catch(Exception ex)
		{
			System.err.println("Exception handled in main");
		}
	}
	
	// Demonstrate try..catch..finally blocks
	public static void throwException() throws Exception // throws used to inherit
	{
		try
		{
			Scanner input=new Scanner(System.in);
			System.out.println("Enter the value of number 1: ");
			int number1 = input.nextInt();
			System.out.println("Enter the value of number 2: ");
			int number2 = input.nextInt();
			int result = number1/number2;
			System.out.println("The value after dividing is " + result);
			throw new Exception(); // generate system exception
		}
		catch(RuntimeException ex)
		{
			System.err.println("Exception handled in method throwException");
		}
		finally
		{
			System.err.println("Finally is always executed.");
		}
	}
}