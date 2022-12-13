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
<title>Edit page</title>
</head>
<body>
<div class="container" style="display:flex; justify-items:space-between">
<div><h2>Edit Expense</h2></div>
<div><a href="/expenses/all">Go Back</a></div>
</div>
	<div class="container">
		<form:form action="/expenses/${expense.id}" method="post" modelAttribute="expense">
		<input type="hidden" name="_method" value="put">
			<div class="form-group">
				<form:label path="name">Name</form:label>
				<form:input path="name" class="form-control"/>
				<form:errors class="text-danger" path="name"/>
			</div>
			<div class="form-group">
				<form:label path="vendor">Vendor</form:label>
				<form:input path="vendor" class="form-control"/>
				<form:errors class="text-danger" path="vendor"/>
			</div>
			<div class="form-group">
				<form:label path="cost">Cost</form:label>
				<form:input path="cost" class="form-control"/>
				<form:errors class="text-danger" path="cost"/>
			</div>
			<div class="form-group">
				<form:label path="description">Description</form:label>
				<form:input type="textare" path="description" class="form-control"/>
				<form:errors class="text-danger" path="description"/>
			</div>
			<input type="submit" value="Submit" class="btn btn-primary"/>
		</form:form>
	</div>
</body>
</html>