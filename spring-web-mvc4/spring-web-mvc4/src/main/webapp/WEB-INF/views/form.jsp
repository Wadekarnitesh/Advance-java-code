<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index file</title>
</head>
<body>


	<center>
		<fieldset>

			<form action="save" method="post">
				<h2>Employee Form</h2>
				<hr> <br>
				Name: <input type="text" name="name"> <br> <br>
				salay: <input type="number" name="salary"> <br> <br>
				skill <input type="text" name="skill"> <br>
				<br>
				<button type="submit">Submit</button>
			</form> <br>
			
			<a href="show">See all Employees</a>

			
		</fieldset>
	</center>

</body>
</html>