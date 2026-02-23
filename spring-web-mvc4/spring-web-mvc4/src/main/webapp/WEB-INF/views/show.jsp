<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<center>
		<fieldset>

			<h2>All EMP</h2>
			<hr>

			<table border="1" cellpadding="10">
				<tr style="background-color: aqua">
					<th>ID</th>
					<th>Name</th>
					<th>salary</th>
					<th>skill</th>
					<th>Update</th>
					<th>Delete</th>
				</tr>


				<c:forEach var="s" items="${list}">


					<tr>
						<td>${s.id }</td>
						<td>${s.name }</td>
						<td>${s.salary }</td>
						<td>${s.skill }</td>
						<td><a href="update">Update </a></td>
						<td><a href="delete?id=${s.id }"> Delete </a></td>

					</tr>

				</c:forEach>
				
				



			</table>
		</fieldset>
	</center>

</body>
</html>