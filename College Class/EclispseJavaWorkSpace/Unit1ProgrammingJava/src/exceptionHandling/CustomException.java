package exceptionHandling;

class OwnException extends Exception
{
	public OwnException(String message)
	{
		super(message);
	}
}
public class CustomException{
	public static void studentAge(int age) throws OwnException
	{
		if(age<0)
		{
				throw new OwnException("Age Less Than Zero Exception");
			
		}
		else
		{
			System.out.println("Valid Age");
		}
			
	}
	public static void main(String[] args)
	{
		try
		{
			studentAge(2); // valid input
			studentAge(-2); // throws a custom exception
			
		}
		catch(OwnException ex)
		{
			ex.printStackTrace();
		}
	}
}	