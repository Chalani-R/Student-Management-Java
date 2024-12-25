<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="Header.jsp" %>
	
	<form action="admin" method="post">
	<h1>Add Admin Form</h1>
	    Name: <input type="text" name="NAME" placeholder="Enter your name"><br><br>
		Email: <input type="email" name="EMAIL" placeholder="Enter your email"><br><br>
		Phone: <input type="number" name="PHONE" placeholder="Enetr your phone number"><br><br>
		Age: <input type="number" name="AGE" placeholder="Enter your age"><br><br>
		Position: <input type="text" name="POSITION" placeholder="Enter your position"><br><br>
		Use Name: <input type="text" name="USERNAME" placeholder="Create your username"><br><br>
		Password: <input type="password" name="PASSWORD" placeholder="Create your password"><br><br>
		<input type="submit" name="SUBMIT" value="Create my account">
		
	</form>
	<%@ include file="Footer.jsp" %>
</body>
</html>