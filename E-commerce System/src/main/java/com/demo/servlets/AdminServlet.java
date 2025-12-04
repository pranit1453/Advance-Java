package com.demo.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.Products;
import com.demo.services.ProductService;
import com.demo.services.ProductServiceImpl;

@WebServlet("/adminProducts")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ProductService pservice = new ProductServiceImpl();

		List<Products> products = pservice.getProducts();
		request.setAttribute("products", products);
		RequestDispatcher rd = request.getRequestDispatcher("adminProducts.jsp");
		rd.forward(request, response);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		processRequest(request, response);
		ProductService pservice = new ProductServiceImpl();

		List<Products> products = pservice.getProducts();
		request.setAttribute("products", products);
		RequestDispatcher rd = request.getRequestDispatcher("adminProducts.jsp");
		rd.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		processRequest(request, response);
		doGet(request, response);
	}

}
