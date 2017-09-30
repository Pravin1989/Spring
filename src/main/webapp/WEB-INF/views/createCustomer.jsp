<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
<link rel="stylesheet" type="text/css" href="<c:url value="/assets/css/bootstrap.min.css"/>" media="all" />
</head>
<body>	
	<form:form method="POST" action="/saveCustomerData" modelAttribute="customer">
	<h1>Wel Come to Customer Registration Page</h1>
	<div class="form-group">
	<form:label path="name">Name :</form:label>
	<form:input path="name" class="form-control"/>
	</div>
	<div>
	<form:label path="email">Email :</form:label>
	<form:input path="email" class="form-control"/>
	</div>
	<div>
	<form:label path="address">Address :</form:label>
	<form:input path="address" class="form-control"/>
	</div>
	<div>
	<form:label path="salary">Salary :</form:label>
	<form:input path="salary" class="form-control"/>
	</div>
	<div>
	<input type="submit" value="Save" class="btn btn-default">
	</div>
	</form:form>
</body>

</html>
