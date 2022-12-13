package exceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;
// Finally helps in resources Delocating
public class FinallyConcept 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		try
		{
			System.out.println("Input number of iteration:");
			int it = input.nextInt();
			for(int i=0; i<it; i++)
			{
				if(i == 5)
				{
					break;
//					 continue; // will not print 5 and executes finally
//					 return; // will executes finally
//					System.exit(0); wont executes finally
				}
				System.out.println(i);
			}
		}
		catch(InputMismatchException ex)
		{
			System.err.println(ex);
		}
		catch(Exception ex)
		{
			System.err.println(ex);
		}
		finally
		{
			System.out.println("I always Execute");
		}
	}
}
