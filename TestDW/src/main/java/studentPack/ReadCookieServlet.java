package studentPack;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadCookieServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
//		Cookie Retrieval
		Cookie[] ck = request.getCookies();
		for (int i = 0; i < ck.length; i++) {
			out.println("Saved Cookies are: " + ck[i].getName()); // Name of a Cookie
			out.println("Saved Cookies are: " + ck[i].getValue());
		}
	}

}
