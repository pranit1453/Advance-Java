<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Data Page</title>
</head>
<body>
	<h2>Edit Data here....</h2>
	<form action="edit" method="post">
		<h2>Edit For Id, ${p.pid }</h2>
		<input type="hidden" name="id" value="${param.id }" /><br /> Edit
		Product Name: <input type="text" name="nm" value="${p.pname }" id="nm" /><br />
		Edit Product Price: <input type="number" name="price"
			value="${p.price }" id="price" /><br /> Edit Product Quantity: <input
			type="number" name="qty" value="${p.qty }" id="qty" /><br /> Edit
		Product Date: <input type="date" name="dt" value="${p.ldt }" id="dt" /><br />
		Edit Product Category: <input type="text" name="ct"
			value="${p.category }" id="ct" /><br />
		<button type="submit" name="btn" value="update" id="btn">Update
			Data</button>
	</form>
</body>
</html>