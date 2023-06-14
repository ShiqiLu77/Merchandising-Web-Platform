<%--  --%><%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Homepage</title>
</head>
<body>
	Hello World
	<a href="customer/view">View Users</a>
	<form method="post" action="user/save">
		First Name : <input type="text" name="firstName"/><br/>
		Last Name : <input type="text" name="lastName"/><br/>
		Username : <input type="text" name="username"/><br/>
		Password : <input type="text" name="password"/><br/>
		<input type="submit" value="Save "/>
	</form>
</body>
</html>