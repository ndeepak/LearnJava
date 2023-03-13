package q9Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

	Connection con;

	public Database() throws ClassNotFoundException, SQLException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

//		String server = "//<>Database name";

		String server = "//Obs";

		int port = 1433;
//		String database = "<Db name >";
		String database = "Lab2DB";
		String connectionStr = "jdbc:sqlserver:" + server + ":" + port + ";" + "databaseName=" + database
				+ ";IntegratedSecurity=true";

		con = DriverManager.getConnection(connectionStr);
		System.out.println("Connection Obtained.");

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new Database();
	}

	public Connection getConnection() {
		// TODO Auto-generated method stub
		return con;

	}

}
