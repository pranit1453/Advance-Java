package com.demo.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.services.CartService;
import com.demo.services.CartServiceImpl;

@WebServlet("/cart")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			String pname = request.getParameter("pname");
			if (pname != null && !pname.trim().isEmpty()) {
				int pid = Integer.parseInt(request.getParameter("id"));
				double price = Double.parseDouble(request.getParameter("price"));
				int qty = Integer.parseInt(request.getParameter("qty"));
				double total = price * qty;
				CartService cservice = new CartServiceImpl();
				boolean status = cservice.addToCart(pid, pname, price, qty, total);
				if (status) {
					request.setAttribute("message", "Added to Cart...");
					RequestDispatcher rd = request.getRequestDispatcher("userProducts");
					rd.forward(request, response);
				} else {
					request.setAttribute("message", "Failed to add to cart.");
					RequestDispatcher rd = request.getRequestDispatcher("userProducts");
					rd.forward(request, response);
				}
			} else {
				request.getRequestDispatcher("cart.jsp").forward(request, response);
			}
		} catch (NumberFormatException e) {
			request.setAttribute("message", "Invalid input. Please check your product details.");
			request.getRequestDispatcher("userProducts").forward(request, response);
		} catch (Exception e) {
			request.setAttribute("message", "Unexpected error occurred.");
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

}

/*
 * package com.demo.servlets;

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

@WebServlet("/cart")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			HttpSession session = request.getSession(true);
			String pname = request.getParameter("pname");
			if (pname != null && !pname.trim().isEmpty()) {
				int pid = Integer.parseInt(request.getParameter("id"));
				double price = Double.parseDouble(request.getParameter("price"));
				int qty = Integer.parseInt(request.getParameter("qty"));
				double total = price * qty;
				CartService cservice = new CartServiceImpl();
				boolean status = cservice.addToCart(pid, pname, price, qty, total);
				if (status) {
					List<Carts> cart = cservice.getCart();
					session.setAttribute("cart", cart);
					request.setAttribute("message", "Added to Cart...");
//					RequestDispatcher rd = request.getRequestDispatcher("userProducts");
//					rd.forward(request, response);
					response.sendRedirect("cart.jsp");
				} else {
					request.setAttribute("message", "Failed to add to cart.");
					RequestDispatcher rd = request.getRequestDispatcher("userProducts");
					rd.forward(request, response);
				}
			} else {
				request.getRequestDispatcher("cart.jsp").forward(request, response);
			}
		} catch (NumberFormatException e) {
			request.setAttribute("message", "Invalid input. Please check your product details.");
			request.getRequestDispatcher("userProducts").forward(request, response);
		} catch (Exception e) {
			request.setAttribute("message", "Unexpected error occurred.");
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

}

 * */
