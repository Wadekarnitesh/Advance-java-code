<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<center>
		<fieldset>

			<form action="patch">
				<h2>Update Student</h2>
				ID: <input type="text" name="id" value="${student.id} "  disabled="disabled"><br>

				First Name: <input type="text" name="firstName"
					value="${student.firstName}"><br> 
					Last Name: <input
					type="text" name="lastName" value="${student.lastName}"><br>
				Password: <input type="text" name="password"
					value="${student.password}"><br> Phone: <input
					type="number" name="phone" value="${student.phone}"><br>

				<button type="submit">Update</button>
			</form>

		</fieldset>
	</center>

</body>
</html>