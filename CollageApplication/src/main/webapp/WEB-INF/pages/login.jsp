<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isErrorPage="false"%>
	<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<form:form  method="Post" modelAttribute="lcmd" >
	<table style="with: 50%">
    ${msg}
			<tr>
				<td>UserName</td>
				<td><form:input path="userName" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><form:password path="pwd" /></td>
			</tr>
		</table>
			<input type="submit" value="Login" />
	</form:form>

	
	<center>${result}</center>