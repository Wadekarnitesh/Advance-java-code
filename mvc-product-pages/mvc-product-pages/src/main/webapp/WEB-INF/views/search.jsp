<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f6f8;
    }

    .search-box {
        margin-top: 15px;
        margin-bottom:50px;
        padding: 20px;
        background: white;
        width: 300px;
        border-radius: 10px;
        box-shadow: 0 4px 10px rgba(0,0,0,0.1);
    }

    input[type="search"] {
        width: 80%;
        padding: 8px;
        border-radius: 5px;
        border: 1px solid #ccc;
        outline: none;
    }

    input[type="submit"] {
        margin-top: 10px;
        padding: 8px 15px;
        border: none;
        border-radius: 5px;
        background-color: #007bff;
        color: white;
        cursor: pointer;
    }

    input[type="submit"]:hover {
        background-color: #0056b3;
    }
</style>

</head>
<body>

<center>
    <div class="search-box">
        <form action="data" method="">
            <input type="search" name="data" placeholder="Search here...">
            <br><br>
            <input type="submit" value="Search">
        </form>
    </div>
</center>

</body>
</html>
