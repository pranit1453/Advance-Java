package com.demo.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.Users;
import com.demo.services.LoginService;
import com.demo.services.LoginServiceImpl;

@WebServlet("/loginservlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String uname = request.getParameter("uname");
		String psw = request.getParameter("psw");

		LoginService lservice = new LoginServiceImpl();
		Users user = lservice.validateAndShowProduct(uname, psw);

		if (user != null) {
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			session.setMaxInactiveInterval(600);
			if (session.isNew()) {
				session.setAttribute("message", "new session created");
			}

			if ("admin".equals(user.getRole())) {
				RequestDispatcher rd = request.getRequestDispatcher("adminProducts");
				rd.forward(request, response);
			} else {
				RequestDispatcher rd = request.getRequestDispatcher("userProducts");
				rd.forward(request, response);

			}
		} else {
			request.setAttribute("error", "Invalid Credentials");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
	}

}
