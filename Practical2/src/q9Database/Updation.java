package q9Database;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Updation 
{
	Connection con;
	Statement statement;
	ResultSet set;
	
	public Updation() throws ClassNotFoundException, SQLException
	{
		con = new Database().getConnection();
		statement = con.createStatement();
		String update = "UPDATE College_tbl SET CollegeName='Vedas'" + " WHERE id = 3";
		set = statement.executeQuery("SELECT * FROM College_tbl");
		
		while(set.next())
		{
			System.out.println("College ID:" + set.getInt("id"));
			System.out.println("COllege Name: " + set.getString("CollegeName"));
		}
	}
	
	public static void main(String[] args) 
	{
		new Updation();
	}

}
