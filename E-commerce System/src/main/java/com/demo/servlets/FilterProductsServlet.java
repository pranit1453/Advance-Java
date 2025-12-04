package com.demo.servlets;

import java.io.IOException;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.Products;
import com.demo.services.ProductService;
import com.demo.services.ProductServiceImpl;

@WebServlet("/filterProducts")
public class FilterProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ProductService pservice = new ProductServiceImpl();
		String[] selectedCategories = request.getParameterValues("category");
		Set<Products> filtered = pservice.getProductsByCategories(selectedCategories);
		request.setAttribute("products", filtered);
		RequestDispatcher rd = request.getRequestDispatcher("userProducts.jsp");
		rd.forward(request, response);
	}

}
