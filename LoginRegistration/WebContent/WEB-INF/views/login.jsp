<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<form:form action="processLogin" modelAttribute="login">
		<table>
			<tr>
				<td>User Name:</td>
				<td><form:input path="userName" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><form:input path="password" type="password" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Login" /></td>
			</tr>
			<tr>
				<td></td>
				<td><a href="index.jsp">HOME</a></td>
			</tr>

		</table>
	</form:form>
	
	<br>
	<p style="font-style: italic; color: red;">${error}</p>
</body>
</html>