<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cart Page</title>
</head>
<body>
	<h2>Cart of, ${sessionScope.user.username}</h2>
	<c:if test="${not empty message } ">
		<p style="color: red;">${message }</p>
	</c:if>
	<form action="placeorder" method="post">
		<table border="1">
			<tr>
				<th>PiD</th>
				<th>Name</th>
				<th>Price</th>
				<th>Quantity</th>
				<th>Total</th>
				<th>Action</th>
			</tr>
			<c:forEach var="lct" items="${sessionScope.lcart }">

				<tr>
					<td>${lct.pid }</td>
					<td>${lct.pname }</td>
					<td>${lct.price }</td>
					<td>${lct.qty }</td>
					<td>${lct.price *lct.qty}</td>
					<td><a href="removefromcart?id=${lct.pid}">Remove From
							Cart</a></td>
				</tr>
			</c:forEach>

		</table>
		<button type="submit" name="btn" value="Place Order">Place
			Order</button>
	</form>
</body>
</html>