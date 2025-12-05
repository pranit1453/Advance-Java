package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.MyUser;
import com.demo.services.ResetServices;
import com.demo.services.ResetServicesImpl;

@WebServlet("/resetpsw")
public class ResetPswServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		HttpSession session = request.getSession();
		MyUser user = (MyUser) session.getAttribute("user");
		if (user != null && user.getRole().equals("user")) {
			//session.setMaxInactiveInterval(300000);
			PrintWriter out = response.getWriter();
			String uname = request.getParameter("uname");
			String email = request.getParameter("email");
			String pass = request.getParameter("pass");

			ResetServices rservices = new ResetServicesImpl();
			boolean status = rservices.resetPsw(uname, email, pass);
			if (status) {
				out.println("<h5>Password Changed...</h5>");
				RequestDispatcher rd = request.getRequestDispatcher("login.html");
				rd.include(request, response);
			} else {
				out.println("<h3>Username and Email is Incorrect</h3>");
				RequestDispatcher rd = request.getRequestDispatcher("login.html");
				rd.include(request, response);
			}
		}

	}

}
