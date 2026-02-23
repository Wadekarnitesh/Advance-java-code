<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Products</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f5f5f5;
    }

    a {
        text-decoration: none;
        color: #007bff;
        font-weight: bold;
    }

    a:hover {
        color: #0056b3;
    }

    h2, h3 {
        margin: 5px 0;
    }

    .container {
        display: flex;
        flex-wrap: wrap;
        justify-content: center;
        gap: 20px;
    }

    .card {
        background: white;
        width: 250px;
        padding: 15px;
        border-radius: 10px;
        box-shadow: 0 4px 10px rgba(0,0,0,0.1);
        transition: transform 0.2s;
        text-align: center;
    }

    .card:hover {
        transform: scale(1.05);
    }

    .card img {
        border-radius: 8px;
        object-fit: cover;
    }

    .price {
        color: green;
        font-size: 18px;
        font-weight: bold;
    }

    .top-links {
        margin-bottom: 20px;
    }

</style>
</head>

<body>

<center>

    <div class="top-links">
        <a href="update">Update Data</a> |
        <a href="/pages">See by Pages</a>
    </div>

    <hr>
    <hr>
    
    <div>
    
   <%@ include file="search.jsp" %>
    </div>

    <h2>All Products</h2>

    <div class="container">

        <c:forEach var="p" items="${product}">

            <div class="card">
                <h3>${p.name}</h3>
                <p>ID: ${p.id}</p>
                <img src="${p.img}" height="200" width="200" />
                <p class="price">₹ ${p.price}</p>
            </div>

        </c:forEach>

    </div>

</center>

</body>
</html>
