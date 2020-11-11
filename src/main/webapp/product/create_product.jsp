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
    <title>Create new product</title>
</head>
<body>
<form method="post">
    <fieldset>
        <legend>Add new product</legend>
        <table>
            <tr>
                <td>Name</td>
                <td><input type="text" name="name" ></td>
            </tr>
            <tr>
                <td>Price</td>
                <td><input type="text" name="price" ></td>
            </tr>
            <tr>
                <td>Quantity</td>
                <td><input type="text" name="quantity" ></td>
            </tr>
            <tr>
                <td>Color</td>
                <td><input type="text" name="color" ></td>
            </tr>
            <tr>
                <td>Description</td>
                <td><input type="text" name="description" ></td>
            </tr>
            <tr>
                <td>Category</td>
                <td><input type="text" name="category" ></td>
            </tr>

            <tr>
                <td><input type="submit" value="Create product"></td>
            </tr>
            <tr>
                <a href="/display" >Back to list Product</a>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
