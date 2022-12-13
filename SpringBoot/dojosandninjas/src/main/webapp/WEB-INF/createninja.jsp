<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
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
<title>Create Ninja</title>
</head>
<body>
	<form:form action="/ninja/processing" method="post" modelAttribute="ninja">
		<div class="form-group">
			<form:label path="dojo">Dojo</form:label>
			<form:select class="form-control" path="dojo">
				<c:forEach var="dojo" items="${dojos}">
					<form:option value="${dojo}"><c:out value="${dojo.name}"/></form:option>
				</c:forEach>
			</form:select>
			<form:errors path="dojo"/>
		</div>
		<div class="form-group">
			<form:label path="firstName">First Name</form:label>
			<form:input class="form-control" path="firstName" type="text"/>
			<form:errors path="firstName"/>
			</div>
		<div class="form-group">
			<form:label path="lastName">Last Name</form:label>
			<form:input class="form-control" path="lastName" type="text"/>
			<form:errors path="lastName"/>
		</div>
		<div class="form-group">
			<form:label path="age">Age</form:label>
			<form:input class="form-control" path="age" type="number"/>
			<form:errors path="age"/>
		</div>
		<input type="submit" value="Submit" class="btn btn-primary"/>
	</form:form>

</body>
</html>