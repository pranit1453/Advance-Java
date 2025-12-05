package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.services.ProductServices;
import com.demo.services.ProductServicesImpl;

@WebServlet("/insertdata")
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String nm = request.getParameter("nm");
		double price = Double.parseDouble(request.getParameter("price"));
		int qty = Integer.parseInt(request.getParameter("qty"));
		String dateStr = request.getParameter("dt");
		java.sql.Date sqlDate = java.sql.Date.valueOf(dateStr);

		ProductServices pservices = new ProductServicesImpl();
		boolean status = pservices.addProduct(nm, price, qty, sqlDate);

		if (status) {
			out.println("<h2>Product Successsfully Added....</h2>");
			RequestDispatcher rd = request.getRequestDispatcher("showproduct");
			rd.include(request, response);
		}else {
			out.println("<h2>Unable to add data!!!</h2>");
			RequestDispatcher rd = request.getRequestDispatcher("showproduct");
			rd.include(request, response);
		}

	}

}
