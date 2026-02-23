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

			<hr>
			<%-- <%@ include file="update.jsp" %> --%>



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

				<c:forEach var="p" items="${list}">
					<tr>
						<td>${p.id }</td>
						<td>${p.name }</td>
						<td>${p.salary }</td>
						<td>${p.skill }</td>
						<td><a href="update?id=${p.id }">Update </a></td>
						<td><a href="delete?id=${p.id }"> Delete </a></td>

					</tr>

				</c:forEach>


			</table>

			<br> <br>

			<div>
				

				<c:forEach begin="0" end="${totalPages - 1}" var="i">
					<a href="display?page=${i}"> ${i + 1} </a>
				</c:forEach>

				<c:if test="${currentPage + 1 < totalPages}">
					<a href="display?page=${currentPage + 1}">Next- </a>
				</c:if>
			</div>

			<br> 

			<div>

				<a href="home"> -Back-</a>
			</div>
		</fieldset>
	</center>



</body>
</html>