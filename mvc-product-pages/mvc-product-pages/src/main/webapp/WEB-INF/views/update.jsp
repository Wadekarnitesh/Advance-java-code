<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Product</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f6f8;
    }

    fieldset {
        width: 350px;
        padding: 20px;
        border-radius: 10px;
        border: 1px solid #ccc;
        background-color: white;
        box-shadow: 0 4px 10px rgba(0,0,0,0.1);
    }

    h2 {
        margin-bottom: 15px;
    }

    input {
        width: 90%;
        padding: 8px;
        margin: 6px 0 12px 0;
        border-radius: 5px;
        border: 1px solid #ccc;
    }

    button {
        padding: 10px 20px;
        border: none;
        background-color: #007bff;
        color: white;
        font-size: 16px;
        border-radius: 6px;
        cursor: pointer;
    }

    button:hover {
        background-color: #0056b3;
    }
</style>

</head>
<body>

<center>
    <fieldset>
        <form action="save" method="post">

            <h2>Product Form</h2>

            Id:
            <input type="text" name="id" required="required">

            Product Name:
            <input type="text" name="name">

            IMG URL:
            <input type="url" name="img">

            Price:
            <input type="number" name="price">

            <button type="submit">Update</button>
        </form>
    </fieldset>
</center>

</body>
</html>
