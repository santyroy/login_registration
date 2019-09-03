<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
</head>
<body>
	Welcome to your profile ${user.firstName}
	<br>
	<table>
		<tr>
			<td>Name:</td>
			<td>${user.firstName } ${user.lastName }</td>
		</tr>
		<tr>
			<td>Email:</td>
			<td>${user.email}</td>
		</tr>
		<tr>
			<td>Address:</td>
			<td>${user.address}</td>
		</tr>
		<tr>
			<td>Phone:</td>
			<td>${user.phone}</td>
		</tr>
	</table>

	<br>
	<form action="logout">
		<a href="index.jsp">Logout</a>
	</form>

</body>
</html>