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

			<form action="save" method="post">
				<h2>Update Student</h2> <br>
				ID: <input type="number" name="id" value=""  /><br>
					 Name: <input type="text" name="name" value=""><br>
					 Salary: <input type="number" name="salary" value=""><br>
				Skill: <input type="text" name="skill" value=""><br>


				<button type="submit">Update</button>
			</form>
<%-- 			<form action="save" method="post">
				<h2>Update Student</h2> <br>
				ID: <input type="number" name="id" value="${emp.id}" readonly="readonly" /><br>
					 Name: <input type="text" name="name" value="${emp.name}"><br>
					 Salary: <input type="number" name="salary" value="${emp.salary}"><br>
				Skill: <input type="text" name="skill" value="${emp.skill}"><br>


				<button type="submit">Update</button>
			</form> --%>

		</fieldset>
	</center>

</body>
</html>