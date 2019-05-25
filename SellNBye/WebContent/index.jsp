<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home | SellNBye</title>
<link href="Controller/css/bootstrap.min.css" rel="stylesheet">
<script src="Controller/js/jquery-3.4.1.min.js" type="text/javascript"></script>
<script src="Controller/js/popper.min.js" type="text/javascript"></script>
<script src="Controller/js/bootstrap.min.js" type="text/javascript"></script>
<script src="Controller/js/validation.js" type="text/javascript"></script>
</head>
<body>
<br><br>
<div class="container">
	<h2>Login</h2>
	<form action="">
		<div class="form-group">
			<label for="email">Username:</label>
			<input type="text" class="form-control" id="text" placeholder="Enter Username" name="username">
		</div>
		<div class="form-group">
			<label for="pwd">Password:</label>
			<input type="password" class="form-control" id="password" placeholder="Enter password" name="password">
		</div>
		<button type="submit" class="btn btn-primary">Login</button>
	</form>
</div>
</body>
</html>