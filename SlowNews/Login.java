package com.github.artembp.slownews.servlet.LoginServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
		private final String userID ="admin";
		private final String passwordID="password";
	
	protected void doGet(HttpServletRequest req,HttpServletResponse resp)
		throws ServletException, IOException {

		 resp.setContentType("text/html");
		
		 HttpSession session = req.getSession();
		 
		String name = req.getParameter("user");
		String pwd = req.getParameter("pwd");
	
		if(userID.equals(name) && passwordID.equals(pwd)) {
			
			session.setAttribute("user", name); 
			
			Cookie userName = new Cookie("user", name);
			userName.setMaxAge(30*60);
			resp.addCookie(userName);
			resp.sendRedirect("main.jsp");
		} else {
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.html");
			PrintWriter pw = resp.getWriter();
			pw.println("<body><h1 style=\"color:red; text-align:center\">Username or Password wrong</h1></body>");
			rd.include(req, resp);
		}
		
	}
}
