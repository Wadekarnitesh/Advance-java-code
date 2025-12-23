<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	
	<%
	
	String user=request.getParameter("u");
	String pass=request.getParameter("p");
	
		
	if(user.equalsIgnoreCase("abc") && pass.equalsIgnoreCase("123")){
	%>
	<h1> login success </h1>
	<% 
	}
	else{
	%>
		
		<h1> fail</h1>
		<%@ include file="Login2.html"  %>
	<%
		
	}
	
	%>

</body>
</html>