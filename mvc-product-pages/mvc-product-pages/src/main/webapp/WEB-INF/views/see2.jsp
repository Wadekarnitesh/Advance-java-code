<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Products</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f6f8;
    }

    a {
        text-decoration: none;
        color: #007bff;
        font-weight: bold;
        margin: 0 5px;
    }

    a:hover {
        color: #0056b3;
    }

    .search-box {
        margin: 20px 0;
    }

    .search-box input {
        padding: 8px;
        width: 250px;
        border-radius: 5px;
        border: 1px solid #ccc;
    }

    .search-box button {
        padding: 8px 15px;
        border: none;
        background-color: #007bff;
        color: white;
        border-radius: 5px;
        cursor: pointer;
    }

    .search-box button:hover {
        background-color: #0056b3;
    }

    .products {
        display: flex;
        flex-wrap: wrap;
        justify-content: center;
        gap: 20px;
    }

    .card {
        background: white;
        width: 220px;
        padding: 15px;
        border-radius: 10px;
        box-shadow: 0 4px 8px rgba(0,0,0,0.1);
        text-align: center;
        transition: transform 0.2s;
    }

    .card:hover {
        transform: scale(1.05);
    }

    .card img {
        width: 150px;
        height: 150px;
        object-fit: cover;
        border-radius: 8px;
    }

    .price {
        color: green;
        font-size: 18px;
        font-weight: bold;
    }

    .pagination {
        margin: 20px;
    }

    .pagination a {
        padding: 6px 10px;
        border: 1px solid #ccc;
        border-radius: 5px;
        background: white;
    }

    .pagination a:hover {
        background: #007bff;
        color: white;
    }
</style>
</head>

<body>

<center>

    <h3>
        <a href="update">Update Data</a>
    </h3>

    <hr>

    <!-- Search Bar -->
    <div class="search-box">
        <form action="search" method="get">
            <input type="text" name="keyword"
                   placeholder="Search product..."
                   value="${keyword}">
            <button type="submit">Search</button>
        </form>
    </div>

    <h2>Products</h2>

    <!-- Product Cards -->
    <div class="products">
        <c:forEach var="p" items="${product}">
            <div class="card">
                <h3>${p.name}</h3>
                <img src="${p.img}">
                <p class="price">₹ ${p.price}</p>
            </div>
        </c:forEach>
    </div>

    <!-- Pagination -->
    <div class="pagination">

        <!-- Previous -->
        <c:if test="${currentPage > 0}">
            <c:choose>
                <c:when test="${not empty keyword}">
                    <a href="search?keyword=${keyword}&page=${currentPage - 1}">⬅ Prev</a>
                </c:when>
                <c:otherwise>
                    <a href="pages?page=${currentPage - 1}">⬅ Prev</a>
                </c:otherwise>
            </c:choose>
        </c:if>

        <!-- Page Numbers -->
        <c:forEach begin="0" end="${totalPages - 1}" var="i">
            <c:choose>
                <c:when test="${not empty keyword}">
                    <a href="search?keyword=${keyword}&page=${i}">${i + 1}</a>
                </c:when>
                <c:otherwise>
                    <a href="pages?page=${i}">${i + 1}</a>
                </c:otherwise>
            </c:choose>
        </c:forEach>

        <!-- Next -->
        <c:if test="${currentPage + 1 < totalPages}">
            <c:choose>
                <c:when test="${not empty keyword}">
                    <a href="search?keyword=${keyword}&page=${currentPage + 1}">Next ➡</a>
                </c:when>
                <c:otherwise>
                    <a href="pages?page=${currentPage + 1}">Next ➡</a>
                </c:otherwise>
            </c:choose>
        </c:if>

    </div>

</center>

</body>
</html>
