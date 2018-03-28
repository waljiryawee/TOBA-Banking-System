package com.toba.banking;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet(urlPatterns = "/loginServlet")
public class LoginServlet extends HttpServlet {

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		//request.getRequestDispatcher("/WEB-INF/views/login.html").forward(request, response);
		throw new ServletException("Hello World");
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(username.equals("jsmith@toba.com") && password.equals("letmein"))
			request.getRequestDispatcher("/WEB-INF/views/account_activity.html").forward(request, response);
		else
			request.getRequestDispatcher("/WEB-INF/views/login_failure.html").forward(request, response);
	}

}