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
				<input type="hidden" name="id" value="${emp.id}" /> Name: <input
					type="text" name="name" value="${emp.name}" /><br>
				<br> Salary: <input type="number" name="salary"
					value="${emp.salary}" /><br>
				<br> Skill: <input type="text" name="skill"
					value="${emp.skill}" /><br>
				<br>

				<button type="submit">Update</button>
			</form>


		</fieldset>
	</center>

</body>
</html>