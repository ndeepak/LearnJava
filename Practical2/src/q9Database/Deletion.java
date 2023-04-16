package q9Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Deletion {

	public Deletion() throws ClassNotFoundException, SQLException {
		Connection con;
		Statement statement;
		ResultSet set;
		con = new Database().getConnection();
		statement = con.createStatement();
//		String update = "DELETE Student_tbl SET LastName='Nagarkoti'" + " WHERE id = 1";
		String delete = "DELETE FROM Student_tbl WHERE id = '2'";
		statement.executeUpdate(delete);
		set = statement.executeQuery("SELECT * FROM Student_tbl");

		while (set.next()) {
			System.out.println("Student ID:" + set.getInt("id"));
			System.out.println("Student Last Name: " + set.getString("FirstName"));
		}
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		new Deletion();
	}

}
