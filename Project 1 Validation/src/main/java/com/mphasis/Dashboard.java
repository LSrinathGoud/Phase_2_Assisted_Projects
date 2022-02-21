package com.mphasis;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




@WebServlet("/Dashboard")
public class Dashboard extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.getWriter().println("Welcome " 
		+ request.getParameter("userName")
		+ ". You are now logged in...");
		
		PrintWriter out = response.getWriter();
		
		out.println("<br/><a href=\"Logout\"> Click Here For LogOut </a>");
}
		
	}