<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Login</title>
</head>
<body>
	<h2>Login Page</h2>
	<form action="login" method="post">
		Username: <input type="text" name="username" required /><br />
		Password: <input type="password" name="password" required /><br /> <input
			type="submit" value="Login" />
	</form>
	<c:if test="${not empty error}">
		<p style="color: red">${error}</p>
	</c:if>
</body>
</html>

</body>
</html>