<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Product Page</title>
</head>
<body>
	<h2>Welcome user, ${sessionScope.user.username}</h2>
	<c:if test="${not empty message}">
		<p style="color: green;">${message}</p>
	</c:if>
	<h3>All Products...</h3>
	<table border="1">
		<tr>
			<th>PiD</th>
			<th>Name</th>
			<th>Price</th>
			<th>Quantity</th>
			<th>Enter Quantity</th>
			<th>Date</th>
			<th>Category</th>
			<th>Action</th>
		</tr>
		<c:forEach var="p" items="${products }">
			<tr>
				<td>${p.pid}</td>
				<td>${p.pname}</td>
				<td>${p.price}</td>
				<td>${p.qty}</td>
				<td><form action="cart" method="post">
						<input type="hidden" name="id" value="${p.pid}" /> <input
							type="hidden" name="pname" value="${p.pname}" /> <input
							type="hidden" name="price" value="${p.price}" /> <input
							type="number" name="qty" min="1" max="${p.qty}" /> <input
							type="submit" value="Add To Cart" />
					</form></td>
				<td>${p.ldt}</td>
				<td>${p.category}</td>
				<td><a href="wishlistProduct?id=${p.pid }">Add to Wishlist</a></td>

			</tr>
		</c:forEach>
	</table>
	<a href="category">Category</a>
	<a href="cartProduct">Cart</a>


</body>
</html>