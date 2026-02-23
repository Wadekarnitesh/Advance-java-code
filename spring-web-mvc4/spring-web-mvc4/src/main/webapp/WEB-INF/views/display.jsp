<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Employee Pagination</title>
</head>
<body>

	<center>
	
		<fieldset>

			<h2>Employee List (Pagination)</h2>

			<table border="1" cellpadding="10">
				<tr style="background-color: lightgray">
					<th>ID</th>
					<th>Name</th>
					<th>Salary</th>
					<th>Skill</th>
				</tr>

				<c:forEach var="e" items="${list}">
					<tr>
						<td>${e.id}</td>
						<td>${e.name}</td>
						<td>${e.salary}</td>
						<td>${e.skill}</td>
					</tr>
				</c:forEach>


			</table>


			<a href="form">ADD NEW</a> <br>

			<!-- Previous -->
			<c:if test="${currentPage > 0}">
				<a href="display?page=${currentPage - 1}">⬅ Previous</a>
			</c:if>

			<!-- Page Numbers -->
			<c:forEach begin="0" end="${totalPages - 1}" var="i">
				<a href="display?page=${i}"> ${i + 1} </a>
			</c:forEach>

			<!-- Next -->
			<c:if test="${currentPage + 1 < totalPages}">
				<a href="display?page=${currentPage + 1}">Next ➡</a>
			</c:if>

		</fieldset>
	</center>

</body>
</html>
