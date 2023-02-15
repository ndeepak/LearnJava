import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementDemo 
{
	Connection con;
	Statement statement;
	ResultSet set;
	PreparedStatement ps;
	
	public PreparedStatementDemo() throws ClassNotFoundException, SQLException
	{
		con = new Database().getConnection();
		String insertps = "Insert INTO College_tbl Values(?,?)";
		// ?  ? Parameter --> (id, value)
		ps = con.prepareStatement(insertps);
		ps.setInt(1, 10);
		ps.setString(2, "Some College");
		ps.execute();
		
		ps.setInt(1, 11);
		ps.setString(2, "Other College");
		ps.execute();
		
		
		statement = con.createStatement();
		set = statement.executeQuery("SELECT * FROM College_tbl");
		
		while(set.next())
		{
			System.out.println("ID:"+ set.getInt("id"));
			System.out.println("Name:"+ set.getString("CollegeName"));
		}
	}
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		new PreparedStatementDemo();
	}

}
