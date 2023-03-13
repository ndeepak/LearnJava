package q9Database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	Connection con;

	public CreateTable() throws ClassNotFoundException, SQLException {
		Statement statement;
		con = new Database().getConnection();
		statement = con.createStatement();

		String create = "Create Table Student_tbl"
				+ "(id int, FirstName varchar(100), LastName varchar(100), ContactNumber varchar(10));";
		statement.executeUpdate(create);
		System.out.println("Table Created");
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new CreateTable();
	}

}
