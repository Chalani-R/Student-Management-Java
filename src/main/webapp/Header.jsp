<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
body {
	margin: 0;
	font-family: Arial, sans-serif;
}

.headerstyle {
	display: flex;
	justify-content: space-between;
	align-items: center;
	padding: 0.5rem 2rem;
	background-color: #000000;
	color: white;
	box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
}

.headerstyle nav {
	display: flex;
	gap: 1.5rem;
}

.headerstyle nav a {
	text-decoration: none;
	color: white;
	font-size: 1rem;
	transition: color 0.3s;
}

.headerstyle nav a:hover {
	color: #3498db;
}
</style>

</head>
<body>


	<header class="headerstyle">

		<nav>


			<a href="HomePage.jsp">Home</a> 
			<a href="AddAdmin.jsp">Add Admin</a>
			<a href="AdminLogin.jsp">Add Student</a>
			<a href="Profile.jsp">Profile</a>



		</nav>

	</header>

</body>
</html>