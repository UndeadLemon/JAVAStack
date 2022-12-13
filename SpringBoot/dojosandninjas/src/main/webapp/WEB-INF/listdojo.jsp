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
<title>View Dojo</title>
</head>
<body>
<p><c:out value="${dojo.name}" /> Ninjas:</p>
<table class="table">
	<thead>
		<tr>
			<th scope="col">
				First Name
			</th>
			<th scope="col">
				Last Name
			</th>
			<th scope="col">
				Age
			</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="ninja" items="${dojo.ninjas}">
			<tr>
				<td>
					<c:out value="${ninja.firstName}" />
				</td>
				<td>
					<c:out value="${ninja.lastName}" />
				</td>
				<td>
					<c:out value="${ninja.age}" />
				</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>