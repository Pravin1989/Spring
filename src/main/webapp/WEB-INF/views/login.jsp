<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/assets/css/bootstrap.min.css"/>" media="all" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/assets/css/myOwn.css"/>" media="all" />
<script src="<c:url value="/assets/css/bootstrap.min.js"/>"></script>
<script src="<c:url value="/assets/css/jquery.min.js"/>"></script>
</head>
<body>	
	<form:form method="POST" action="/SpringBootPOC/login" modelAttribute="loginRequest">	
		<div class="loginContainer">
		<h3>Wel Come to Login</h3>
			<div class="form-group loginFields">
				<form:label path="id">ID :</form:label>
				<form:input class="form-control" path="id" />
			</div>
			<div class="form-group loginFields">
				<form:label path="password">Password:</form:label>
				<form:input class="form-control" path="password" />
			</div>			
			<div class="btn btn-default form-group loginFields">
				<input type="submit" value="Sign In">
			</div>
		</div>
	</form:form>

</body>
</html>
