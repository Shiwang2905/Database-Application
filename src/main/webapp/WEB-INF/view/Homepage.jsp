<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>
	
		<div id="header">
			<h1>Customer Relationship Management</h1>
		</div>
	
	<div id="add">
		<input type="button" value="Add Student" onClick="window.location.href='AddCustomerForm'"/>
				
	</div>
	
	<div id="container">
		<div id="content">
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Action></th>
				</tr>
				
				<c:forEach var="tempcustomer" items="${customers}">
					
					<c:url var="updateLink" value="/Main/updateCustomer">
						<c:param name="customerId" value="${tempcustomer.id}"/>
					</c:url>
					
					<c:url var="deleteLink" value="/Main/deleteCustomer">
						<c:param name="customerId" value="${tempcustomer.id}"/>
					</c:url>
					
					<tr>
						<td>${tempcustomer.firstName }</td>
						<td>${tempcustomer.lastName }</td>
						<td>${tempcustomer.email }</td>
						<td><a href="${updateLink}">Update</a> | <a href="${deleteLink}" onClick="if(!(confirm('Are you sure ?'))) return false">Delete</a></td>
					</tr>
				</c:forEach>
				
			</table>
		</div>
	</div>
		
</body>
</html>