<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Adding Books to table</title>
</head>
<body>
	<%@page import="studentPack.Database"%>


	<h2>Data Requested</h2>
	<%
	int isbn = Integer.parseInt(request.getParameter("isbn"));
	String title= request.getParameter("title");
	String author = request.getParameter("author");
	int price = Integer.parseInt(request.getParameter("price"));
	String publisher = request.getParameter("publisher");
	String edition = request.getParameter("edition");
	
	%>
	<%!Connection con;
	Statement statement;
	ResultSet set;%>

	<%
	con = new Database().getConnection();
	statement = con.createStatement();
	String insert = "INSERT INTO Books_tbl VALUES('"+isbn+"', '"+title+"', '"+author+"', '"+price+"','"+publisher+"', '"+edition+"')";
	statement.executeUpdate(insert);	
	set = statement.executeQuery("SELECT * FROM Books_tbl");	
	%>
	
	<table border=2>
		<th>ISBN</th>
		<th>Title</th>
		<th>Author</th>
		<th>Price</th>
		<th>Publisher</th>
		<th>Edition</th>
		<%
		while(set.next()){
			out.println("<tr>");
				out.println("<td>"+ set.getInt("isbn")+"</td>");
				out.println("<td>"+ set.getString("title")+"</td>");
				out.println("<td>"+ set.getString("author")+"</td>");
				out.println("<td>"+ set.getInt("price")+"</td>");
				out.println("<td>"+ set.getString("publisher")+"</td>");
				out.println("<td>"+ set.getString("edition")+"</td>");
			out.println("</tr>");
		}
		%>
	</table>
	
	
</body>
</html>