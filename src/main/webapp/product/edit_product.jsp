<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 11/3/2020
  Time: 9:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new user</title>
</head>
<body>
<h1>Edit product</h1>

<form method="post">
    <fieldset>
        <legend>Edit product</legend>
        <table>
            <tr>
                <td>Name</td>
                <td><input type="text" name="name" value="${requestScope["product"].getName()}"></td>
            </tr>
            <tr>
                <td>Price</td>
                <td><input type="text" name="price" value="${requestScope["product"].getPrice()}"></td>
            </tr>
            <tr>
                <td>Quantity</td>
                <td><input type="text" name="quantity" value="${requestScope["product"].getQuantity()}"></td>
            </tr>
            <tr>
                <td>Color</td>
                <td><input type="text" name="color" value="${requestScope["product"].getColor()}"></td>
            </tr>
            <tr>
                <td>Description</td>
                <td><input type="text" name="description" value="${requestScope["product"].getDescrision()}"></td>
            </tr>
            <tr>
                <td>Category</td>
                <td><input type="text" name="category" value="${requestScope["product"].getIdCategory()}"></td>
            </tr>

            <tr>
                <td><input type="submit" value="Create user"></td>
            </tr>
            <tr>
                <a href="/display" >Back to list Product</a>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
