package studentPack;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CookieServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("uname");
		
		String password = request.getParameter("password");
		Cookie ck = new Cookie("user", username); // Cookie's Object
		ck.setMaxAge(60 * 60 * 24); // Age of cookie is 1 day

		response.addCookie(ck); // Cookie is saved in the response

		out.println("<form action='ReadCookieServlet' method='post'>");
		out.println("<input type='submit' value='ReadCookie'>");
		out.println("</form>");
	}

}
