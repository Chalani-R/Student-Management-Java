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
	
	<h2>Admin Login</h2>
    <form action="adminvalidate" method="POST">
        Username: <input type="text" id="username" name="username" placeholder="Enter your username" required><br>
        Password: <input type="password" id="password" name="password" placeholder="Enter your password" required><br>
        <button type="submit">Login</button>
    </form>
	
	<%@ include file="Footer.jsp" %>

</body>
</html>