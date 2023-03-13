package q9Database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertionTable{
	Statement statement;
	ResultSet set;

	public InsertionTable() throws ClassNotFoundException, SQLException {
		Connection conn = new Database().getConnection();
		statement = conn.createStatement();
		String insert = "INSERT INTO Student_tbl VALUES(1, 'Deepak','Nagarkoti', '00099999')";
		String insert2 = "INSERT INTO Student_tbl VALUES(2, 'Samjhana','Subedi', '00999')";
		statement.executeUpdate(insert);
		statement.executeUpdate(insert2);
		System.out.println("Data Inserted Into Table");
		set = statement.executeQuery("SELECT * FROM Student_tbl");

		while (set.next()) {
			System.out.println("Student ID: " + set.getInt("id"));
			System.out.println("First Name: " + set.getString("FirstName"));
			System.out.println("Last Name: " + set.getString("LastName"));
			System.out.println("Contact Number: " + set.getString("ContactNumber"));
		}
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		new InsertionTable();
	}
}