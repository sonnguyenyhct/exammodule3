<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 11/11/2020
  Time: 9:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Display Product</title>
</head>
<body>
    <h1>Product list</h1>
    <a href="/display?action=create">Add new product</a>
    <table class="table table-dark">
    <thead>
    <tr>
        <th scope="col">ID</th>
        <th scope="col">Product Name</th>
        <th scope="col">Price</th>
        <th scope="col">Quantity</th>
        <th scope="col">Color</th>
        <th scope="col">Category</th>
        <th rowspan="2" scope="col">Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items='${requestScope["productList"]}' var="product">
        <tr>
            <th>${product.getIdProduct()}</th>
            <td>${product.getNameProduct()}</td>
            <td>${product.getPrice()}</td>
            <td>${product.getCount()}</td>
            <td>${product.getColor()}</td>
            <td>${product.getDescrision()}</td>
            <td>${product.getIdCategory()}</td>
            <td><a href="/display?action=edit&id=${product.getIdProduct()}">Edit</a></td>
            <td><a href="/display?action=delete&id=${product.getIdProduct()}">Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
