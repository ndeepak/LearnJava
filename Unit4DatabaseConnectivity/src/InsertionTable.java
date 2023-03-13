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
		String insert = "INSERT INTO College_tbl VALUES(1, 'Vedas College')";
		statement.executeUpdate(insert);
		System.out.println("Data Inserted Into Table");
		set = statement.executeQuery("SELECT * FROM Collge_tbl");

		while (set.next()) {
			System.out.println("College ID: " + set.getInt("id"));
			System.out.println("College Name: " + set.getString("College Name"));
		}
	}
	public static void main(String[] args){
		new InsertionTable();
	}
}