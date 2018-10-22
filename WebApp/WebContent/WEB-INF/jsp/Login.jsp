<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="../css/login.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Login</title>
</head>
<body>
	<form action="">
		<div class="login_area">
			<h2 style="color:brown">Login</h2>
			<label>User Id:</label>
			<input type="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$"
				placeholder="Enter Email" name="userId" required="">
			<label>Password:</label>
			<input type="password" placeholder="Enter Password" name="password"
				required="">
			<div>
				<input type="submit" value="Login">
				<input type="reset" value="Reset">
			</div>
		</div>
	</form>


</body>
</html>