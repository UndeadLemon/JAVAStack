<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<title>View One</title>
</head>
<body>
<h1>Expense Details</h1><p><a href="/expenses/all">Go Back</a></p>
<p>Name: <c:out value="${expense.name}" /></p>
<p>Description: <c:out value="${expense.description}" /></p>
<p>Cost: <c:out value="${expense.cost}" /></p>
<p>Vendor: <c:out value="${expense.vendor}" /></p>
</body>
</html>