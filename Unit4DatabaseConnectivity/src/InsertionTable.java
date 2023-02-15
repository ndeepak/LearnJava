import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertionTable 
{

	Statement statement;
	Connection con;
	con = new Database().getConnection();	
	ResultSet set;
	public InsertionTable()
	{
		con = new Database().getConnection();
		statement = con.createStatement();
		String insert = "INSERT INTO College_tbl VALUES(1, 'Vedas College')";
		statement.executeUpdate(insert);
		System.out.println("Data Inserted Into Table");
		set = statement.executeQuery("SELECT * FROM Collge_tbl");
		
		while(set.next())
		{
			System.out.println("College ID: "+ set.getInt("id"));
			System.out.println("College Name: " + set.getString("College Name"));
		}
		
		
	}
	public static void main(String[] args) 
	{
		new InsertionTable();
	}

}
