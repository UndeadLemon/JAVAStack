<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
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
<meta charset="UTF-8">
<title>Frooty Loops</title>
</head>
<body>
<h1> Fruit Store</h1>

<ul class="list-group table-striped">
<c:forEach var="fruit" items = "${fruits}">
<li class="list-group-item"><c:out value="${fruit.name}"></c:out>: <c:out value="${fruit.price}"/></li>
</c:forEach>
</ul>

</body>
</html>