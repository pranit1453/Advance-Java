<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	<form action="loginservlet" method="post">
		<h2>Enter Credentials...</h2>
		<c:if test="${not empty error }">
			<p style="color: red;">${error }</p>
		</c:if>
		Enter Username : <input type="text" name="uname" id="uname" /><br />
		Enter Password : <input type="password" name="psw" id="psw" /><br />
		<button type="submit" name="btn" id="btn">Login</button>
	</form>
</body>
</html>