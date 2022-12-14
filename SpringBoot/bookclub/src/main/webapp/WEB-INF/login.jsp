<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<meta charset="ISO-8859-1">
<title>Login/Registration Page</title>
</head>
<body>
<div class="card"><h1>Login and Registration Page</h1></div>
<div class="card flex-box">
	<div class="card">
	<div class="card-body">
		<h2>Register</h2>
			<form:form method="post" action="/users/registerprocess" modelAttribute="newUser">
				<div class="form-group">
					<form:label path="userName">Username</form:label>
					<form:input class="form-control" path="userName" type="text"/>
					<form:errors path="userName"/>
				</div>
				<div class="form-group">
					<form:label path="email">Email</form:label>
					<form:input class="form-control" path="email" type="text"/>
					<form:errors path="email"/>
				</div>
				<div class="form-group">
					<form:label path="password">Password</form:label>
					<form:input class="form-control" path="password" type="text"/>
					<form:errors path="password"/>
				</div>
				<div class="form-group">
					<form:label path="confirm">Confirm Password</form:label>
					<form:input class="form-control" path="confirm" type="text"/>
					<form:errors path="confirm"/>
				</div>
				<input type="submit" value="Register" class="btn btn-primary">
		</form:form>
		</div>
	</div>
	<div class="card">
		<div class="card-body">
			<form:form method="post" action="/users/loginprocess" modelAttribute="newLogin">
				<div class="form-group">
					<form:label path="email">Email</form:label>
					<form:input class="form-control" path="email" type="text"/>
					<form:errors path="email"/>
				</div>
				<div class="form-group">
					<form:label path="password">Password</form:label>
					<form:input class="form-control" path="password" type="text"/>
					<form:errors path="password"/>
				</div>
				<input type="submit" value="Login" class="btn btn-primary">
			</form:form>
		</div>
	</div>
</div>
</body>
</html>