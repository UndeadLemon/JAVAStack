<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<title>Create Dojo</title>
</head>
<body>
<form:form action="/dojo/processing" method="post" modelAttribute = "dojo">
	<div class="form-group">
		<form:label path="name">Name</form:label>
		<form:input class="form-control" path="name" type="text"/>
		<form:errors path="name"/>
	</div>
	<input type="submit" value="Submit">
</form:form>
</body>
</html>