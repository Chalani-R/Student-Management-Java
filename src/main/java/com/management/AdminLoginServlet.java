package com.management;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String USERNAME = request.getParameter("username");
		String PASSWORD = request.getParameter("password");
		
		boolean y = managementDBUtil.adminValidate(USERNAME, PASSWORD);
		
		if(y == true) {
			
			
			RequestDispatcher dis = request.getRequestDispatcher("AddStudent.jsp");
			dis.forward(request, response);
		}
		else {
			out.println("<script>alert('Username or password is incorrect, please check again');</script>");
            RequestDispatcher dis = request.getRequestDispatcher("AdminLogin.jsp");
            dis.include(request, response);
		}
		
	}

}