<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Categories</title>
</head>
<body>
	<h2>Select Category</h2>
	<form action="filterProducts" method="get">
		<ul>
			<c:forEach var="ct" items="${cat}">
				<li><input type="checkbox" name="category" value="${ct.category}" />${ct.category}</li>
			</c:forEach>
		</ul>
		<input type="submit" value="Filter Products" />
	</form>

</body>
</html>