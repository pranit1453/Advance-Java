<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Product Here</title>
</head>
<body>
	<h2>Add Product Here...</h2>
	<form action="addservlet" method="post">
		Enter Product name: <input type="text" name="pname" id="pname" /><br />
		Enter Product price: <input type="number" name="price" id="price" /><br />
		Enter Product Quantity: <input type="number" name="qty" id="qty" /><br />
		Enter Product Date: <input type="date" name="pdt" id="pdt" /><br />
		Enter Product Category: <input type="text" name="ct" id="ct" /><br />
		<button type="submit" name="btn" id="btn">Add Product</button>
	</form>
</body>
</html>