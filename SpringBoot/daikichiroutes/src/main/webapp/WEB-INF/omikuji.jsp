<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

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
<title>Omikuji Form</title>
</head>
<body>
	<div class="container">
		<div class="card">Omikuji Form:</div>
		<div class="container">
			<div class="card">
				<form action="./omikuji_processing" method="post">
					<p>Pick any number from 5 to 25:</p>
					<input type="number" name="number" />
					<p>Enter the name of any city:</p>
					<input type="text" name="city" />
					<p>enter the name of any real person:</p>
					<input type="text" name="person" />
					<p>Enter a professional endeavor or hobby:</p>
					<input type="text" name="hobby" />
					<p>Enter any type of living thing:</p>
					<input type="text" name="animal" />
					<p>Say something nice to someone:</p>
					<input type="text" name="compliment" /> <input type="submit"
						value="send" />
				</form>
			</div>
		</div>
	</div>
</body>
</html>