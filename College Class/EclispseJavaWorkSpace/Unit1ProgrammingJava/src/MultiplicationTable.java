import java.util.Scanner;

public class MultiplicationTable
{
//	int rows = 10; // fixed value, accessed in a class
//	
//	final static int rows = 10; // fixed value, accessed in a class
	// final makes it compulsory to initialize the type
//	final static int cols = 10; // fixed value, accessed in a class

	public static void main(String[] args) 
	{
		MultiplicationTable obj = new MultiplicationTable();
//		obj.rows = 20; // can be edit as object making
		
		
		int rows, cols;
		System.out.println("Enter the value you want to get multiplication of columns: ");
		Scanner sc = new Scanner(System.in); // Scanner for input
		rows= sc.nextInt();  // user input from keyboard
		cols = sc.nextInt();
		int product[][] = new int[rows][cols];
		System.out.println("The Multiplication Table is: ");
		for(int i=1; i<=rows; i++)
		{
			System.out.println("Table of "+ i);
			for(int j=0; j<=cols; ++j)
			{
				product[i][j] = i*j; // Multiplication
				System.out.println(i+ " * " +j+ "=" + product[i][j]);
			}
			System.out.println("-------------------------");
			
		}
 		
		
		
	}

}
