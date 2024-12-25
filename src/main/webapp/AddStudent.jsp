<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@ include file="Header.jsp"%>
	
	
	<h1>Add Student</h1>
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Register No</th>
                    <th>Email</th>
                    <th>Phone</th>
                    <th>NIC</th>
                    <th>Program</th>
                    <th>Year & Semester</th>
                    <th>Address</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>1</td>
                    <td>John Doe</td>
                    <td>202345</td>
                    <td>johndoe@example.com</td>
                    <td>+123456789</td>
                    <td>123456789V</td>
                    <td>Computer Science</td>
                    <td>Year 2, Sem 1</td>
                    <td>123 Street, City</td>
                    <td>
                    <button class="btn action-btn btn-update">Update</button>
                    <button class="btn action-btn btn-delete">Delete</button>
                    </td>
                </tr>
            </tbody>
        </table>
        <button class="btn">Add New Student</button>
	
	
	
	<%@ include file="Footer.jsp"%>


</body>
</html>