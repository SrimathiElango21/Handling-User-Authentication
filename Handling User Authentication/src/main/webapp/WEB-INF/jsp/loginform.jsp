<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Login</title>
</head>
<body>

<h2 style="text-align: center">Login Page</h2>
	
	<div style="color:red;">
	${error} 
	
	</div>
		
	
	<form action="loginform" method='post'>

		<label for="username">Name:</label><br> <input type="text"
			id="username" placeholder="Name Required" name="username" required><br>
		<br> <label for="password">Password:</label><br> 
		<input type="text" id="password" placeholder="Password Required" name="password" required><br>
		<br> <input type="submit" value="Submit POST Request">
	</form>

</body>
</html>