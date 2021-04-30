<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>
<html>
<head>
<title>Save Customer</title>

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css">

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
	 
</head>
<body>

		<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>

	<div id="container">
		<h3>Save Customer</h3>
	
		<form:form action="saveCustomer" modelAttribute="Customer" method="POST">
		
			<form:hidden path="id"/>
						
				First name:<form:input type="text" path="firstName" /><br></br>
						
				Last name:<form:input type="text" path="lastName" /><br></br>
				
				Email:<form:input type="text" path="email" /><br></br>
					
				<input type="submit" value="Save" class="save" /><br></br>
				
				
				
					<!--<tr>
						<td><label>First name:</label></td>
						<td><form:input path="firstName" /></td>
					</tr> <br></br>
				
					<tr>
						<td><label>Last name:</label></td>
						<td><form:input path="lastName" /></td>
					</tr><br></br>

					<tr>
						<td><label>Email:</label></td>
						<td><form:input path="email" /></td>
					</tr><br></br>

					
						<tr>
						<td><input type="submit" value="Save" class="save" /></td>
						</tr>-->
					
		</form:form>
	
		<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/Main/home">Back to List</a>
		</p>
	
	</div>
	
	
</body>
</html>