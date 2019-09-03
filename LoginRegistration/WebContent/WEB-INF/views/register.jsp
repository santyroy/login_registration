<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>

	<form:form action="processRegistration" modelAttribute="user">
		<table>
			<tr>
				<td>User Name:</td>
				<td><form:input path="userName" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><form:input type="password" path="password" /></td>
			</tr>
			<tr>
				<td>First Name:</td>
				<td><form:input path="firstName" /></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><form:input path="lastName" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><form:input path="address" /></td>
			</tr>
			<tr>
				<td>Phone</td>
				<td><form:input path="phone" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Register" /></td>
			</tr>
			<tr>
				<td></td>
				<td><a href="index.jsp">Home</a></td>
			</tr>

		</table>
	</form:form>
</body>
</html>