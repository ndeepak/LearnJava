import java.sql.SQLException;

public class Deletion 
{

	
	public Deletion() throws ClassNotFoundException, SQLException
	{
		con = new Database().getConnection();
		statement = con.createStatement();
		String update = "DELETE College_tbl SET CollegeName='Vedas'" + " WHERE id = 3";
		statement.executeUpdate(delete);
		set = statement.executeQuery("SELECT * FROM College_tbl");
		
		while(set.next())
		{
			System.out.println("College ID:" + set.getInt("id"));
			System.out.println("COllege Name: " + set.getString("CollegeName"));
		}
	}
	
	
	public static void main(String[] args) 
	{

	}

}
