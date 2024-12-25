package com.management;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddAdmin_Servlet")
public class AddAdmin_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String nameS = request.getParameter("NAME");
		String emailS = request.getParameter("EMAIL");
		int phoneS = Integer.parseInt(request.getParameter("PHONE"));
        int ageS = Integer.parseInt(request.getParameter("AGE"));
		String positionS = request.getParameter("POSITION");
		String usernameS = request.getParameter("USERNAME");
		String passwordS = request.getParameter("PASSWORD");
		boolean x;
	
		x = managementDBUtil.insertAdmin(nameS, emailS, phoneS, ageS, positionS, usernameS, passwordS);
		
		if(x == true) {
			
			RequestDispatcher dis = request.getRequestDispatcher("AdminLogin.jsp");
			dis.forward(request, response);
			
		}
		else {
			
			out.print("alert(‘Admin insert is unsuccess');");
			
		}
		
	}

}
