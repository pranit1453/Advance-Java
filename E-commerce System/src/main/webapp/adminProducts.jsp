<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Products</title>
</head>
<body>

	<h2>Welcome Admin, ${sessionScope.user.username}</h2>
	<h3>Manage Products</h3>
	<table border="1">
		<tr>
			<th>PiD</th>
			<th>Name</th>
			<th>Price</th>
			<th>Quantity</th>
			<th>Date</th>
			<th>Category</th>
			<th>Action</th>
		</tr>
		<c:forEach var="p" items="${products}">
			<tr>
				<td>${p.pid}</td>
				<td>${p.pname}</td>
				<td>${p.price}</td>
				<td>${p.qty}</td>
				<td>${p.ldt}</td>
				<td>${p.category}</td>
				<td><a href="editProduct?id=${p.pid}">Edit</a> | <a
					href="deleteProduct?id=${p.pid}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<a href="addProduct.jsp">Add Product</a>


</body>
</html>
