import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AdditionalPropertyOfResultSet 
{

	Connection con;
	Statement statement;
	ResultSet set;
	
	public AdditionalPropertyOfResultSet() throws ClassNotFoundException, SQLException
	{
		con = new Database().getConnection();
		statement = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
//		statement = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		// Insensitive --> Only forward only.
	// ResultSet.READ_ONLY --> cannot delete.
		set = statement.executeQuery("SELECT * FROM College_tbl");
//		set.absolute(5);
		set.relative(-3);
		set.updateInt("id", 1); // ID COlumn
		set.deleteRow();
		
	}
	public static void main(String[] args) 
	{

	}

}
