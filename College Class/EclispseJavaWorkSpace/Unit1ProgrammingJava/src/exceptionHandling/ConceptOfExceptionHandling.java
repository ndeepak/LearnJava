package exceptionHandling;
// Two types

import java.util.InputMismatchException;
import java.util.Scanner;
// Checked Exception-checked at compile time
// Unchecked Exception-checked at run time rather than compiler time.


public class ConceptOfExceptionHandling 
{
	public static int division (int numerator, int denominator)
	{
		return numerator/denominator;
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		boolean contLoop=true;
		do
		{
			System.out.println("Enter Numerator: ");
			int n = input.nextInt();
			System.out.println("Enter Denominator: ");
			int d = input.nextInt();
			try
			{
				System.out.println("The division is: "+ division(n,d));
				contLoop = false; // Above is the exception place
			}
			
			catch(InputMismatchException ex)
			{
				System.err.println("Mismatch Exception is: " +ex);
				System.out.println("Enter Proper Data: ");
			}
			
			catch(ArithmeticException ex)
			{
				System.err.println("Arithmetic Exception is: "+ex);
				System.out.println("Enter Non-zero Denominator: ");
			}
			
			}
		while(contLoop);
	}
	
}
