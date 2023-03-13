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
		String update = "DELETE Student_tbl SET CollegeName='Vedas'" + " WHERE id = 3";
		statement.executeUpdate("delete");
		set = statement.executeQuery("SELECT * FROM Student_tbl");

		while (set.next()) {
			System.out.println("College ID:" + set.getInt("id"));
			System.out.println("COllege Name: " + set.getString("CollegeName"));
		}
	}

	public static void main(String[] args) {

	}

}
