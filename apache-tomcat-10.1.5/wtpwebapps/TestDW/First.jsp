<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First JSP file</title>
</head>
<body>
	<%@include file= "index.html" %>
	<%-- Expression Tag --%>
	<h2>This is my first JSP file in the class.</h2>
	Toady's Date:
	<%=new java.util.Date()%>
	<hr color=red size=5>

	<%--Declaration Tag --%>
	<%!int age = 21;
	String name = "Deepak Nagarkoti";%>
	<hr color=blue size=3>
	<%-- Script-let Tag --%>
	<%
	out.println("Hello World!!");
	%>
	<hr color=yellow size=3>
	<%
	out.println("My name is: " + name + " and my age is: " + age);
	%>
	<hr color=purple size=3>
	
	<%--
	<p>Dates:</p>
	<%@page import="java.util.*" %>
	<%=new Date() %> 
	--%>
</body>
</html>