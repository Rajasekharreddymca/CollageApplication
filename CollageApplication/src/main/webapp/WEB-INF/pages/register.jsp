<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isErrorPage="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
	<h1>Student Register Form</h1>
	${msg}
<!-- 	
	private String fName;
	private String lName;
	private String uName;
	private String pwd;
	private long phno;
	private String addr; -->
	
	
	<form:form modelAttribute="regusercmd"  method="post">
		<table style="with: 50%">
			<tr>
				<td>First Name</td>
				<td><form:input   path="fName" /></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><form:input   path="lName" /></td>
			</tr>
			<tr>
				<td>UserName</td>
				<td><form:input   path="uName" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><form:password   path="pwd" /></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><form:input  path="addr" /></td>
			</tr>
			<tr>
				<td>Contact No</td>
				<td><form:input   path="phno" /></td>
			</tr>
		</table>
		<input type="submit" value="Register" />
	</form:form>
	
	
	<br><br>
	<h1 style="color: blue;text-align: center">${result}</h1>
	
	
</body>
</html>