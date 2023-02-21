package studentPack;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CollegeServlet extends HttpServlet {

	Connection con;
	Statement statement;
	ResultSet set;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String id = request.getParameter("colid");
		int cid = Integer.parseInt(id);
		String name = request.getParameter("colname");

		try {
			con = new Database().getConnection();
			statement = con.createStatement();
			String insert = "INSERT INTO College_tbl VALUES('" + cid + "', '" + name + "')";
			statement.executeUpdate(insert);
			set = statement.executeQuery("SELECT * FROM College_tbl");
			while (set.next()) {
				out.println("College ID = " + set.getInt("id"));
				out.println("College Name = " + set.getString("CollegeName"));
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
