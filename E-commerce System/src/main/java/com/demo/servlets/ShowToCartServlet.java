package com.demo.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.Carts;
import com.demo.services.CartService;
import com.demo.services.CartServiceImpl;

@WebServlet("/cartProduct")
public class ShowToCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		CartService pservice = new CartServiceImpl();

		List<Carts> lcart = pservice.addToCart();
		if (lcart != null) {
			HttpSession session = request.getSession();
			session.setAttribute("lcart", lcart);
			RequestDispatcher rd = request.getRequestDispatcher("cart.jsp");
			rd.forward(request, response);
		} else {
			request.setAttribute("message", "Cart not Found...");
			RequestDispatcher rd = request.getRequestDispatcher("userProducts");
			rd.forward(request, response);
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

}
