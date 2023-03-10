package quesFive;
import java.lang.*;
//class representing custom exception  
class InvalidAgeException extends Exception {
	public InvalidAgeException(String str) {
		// calling the constructor of parent Exception
		super(str);
	}
}

//class that uses custom exception InvalidAgeException  
public class TestCustomException1 {

	// method to check the age
	static void validate(int age) throws InvalidAgeException {
		if (age < 18) {

			// throw an object of user defined exception
			throw new InvalidAgeException(age + ": Age is not valid to vote");
		} else {
			System.out.println("Welcome to Vote");
		}
	}

	// main method
	public static void main(String args[]) {
		try {
			// calling the method
			System.out.println("Validating to 18 age: ");
			validate(18);
			System.out.println(" ");
			System.out.println("Validating to 13 age: ");
			validate(13);

		} catch (InvalidAgeException ex) {
			System.out.println("Caught the exception");

			// printing the message from InvalidAgeException object
			System.out.println("Exception occured: " + ex);
		}

		System.out.println("Rest of the code...");

	}
}