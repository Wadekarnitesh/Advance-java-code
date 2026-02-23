<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="gray">



	<center>
		<fieldset>

		<div style="display: flex; justify-content: space-around; align-items: center;">
		
			<form action="save" method="post">
				<h2>Employee Form</h2>
				<hr>
				<br> Name: <input type="text" name="name"> <br> <br>
				salay: <input type="number" name="salary"> <br> <br>
				skill : <input type="text" name="skill"> <br> <br>
				<button type="submit">Submit</button>
			</form>
			
			<div>
			
			<div>
				<%@ include file="search.jsp"%></div>
			</div>
		</div>
			
			
			


		</fieldset>
	</center>


</body>
</html>