<%@page import="com.jsp.springwebmvc2.entity.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Students</title>
</head>
<body>

<center>
<h2>All Students</h2>

<table border="1" cellpadding="10">
    <tr>
        <th>ID</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Password</th>
        <th>Phone</th>
        <th>Update</th>
        <th>Delete</th>
    </tr>

   <%
    List<Student> students = (List<Student>) request.getAttribute("list");
    for (Student s : students) {
%>
<tr>
    <td><%= s.getId() %></td>
    <td><%= s.getFirstName() %></td>
    <td><%= s.getLastName() %></td>
    <td><%= s.getPassword() %></td>
    <td><%= s.getPhone() %></td>
    <td><a href="update?id=<%= s.getId() %>">Update</a></td>
    <td>
        <a href="delete?id=<%= s.getId() %>">
           Delete
        </a>
    </td>
</tr>
<%
    }
%>

</table>

<br>
<a href="form">Add New Student</a>
</center>

</body>
</html>
