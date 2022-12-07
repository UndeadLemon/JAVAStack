<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css" />
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Show Omikuji</title>
</head>
<body>

	<div class="container">
		<div class="card">
			<h2>Your Omikuji:</h2>
		</div>
		<div class="card bg-color-blue">
			<p>
				In
				<c:out value="${number}" />
				years, you will live in
				<c:out value="${city}" />
				with
				<c:out value="${person}" />
				as your roommate,
				<c:out value="${hobby}" />
				for a living. The next time you see a
				<c:out value="${animal}" />
				, you will have good luck. Also,
				<c:out value="${compliment}" />
			</p>

		</div>
	</div>

</body>
</html>