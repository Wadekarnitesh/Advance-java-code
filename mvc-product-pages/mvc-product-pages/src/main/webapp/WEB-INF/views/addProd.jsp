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
				<h2>Product Form</h2>
				Product Name: <input type="text" name="name"> <br>
				 IMG URL:<input type="url" name="img"> <br>
				
				Price : <input type="number" name="price"> <br>
				<button type="submit">Submit</button>
			</form>
		</fieldset>
	</center>

</body>
</html>