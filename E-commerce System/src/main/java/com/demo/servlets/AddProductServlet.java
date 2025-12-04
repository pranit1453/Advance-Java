package com.demo.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.services.ProductService;
import com.demo.services.ProductServiceImpl;

@WebServlet("/addservlet")
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String pname = request.getParameter("pname");
		double price = Double.parseDouble(request.getParameter("price"));
		int qty = Integer.parseInt(request.getParameter("qty"));
		String pdt = request.getParameter("pdt");
		java.sql.Date sqldate = java.sql.Date.valueOf(pdt);
		String ct = request.getParameter("ct");

		ProductService pservice = new ProductServiceImpl();
		boolean status = pservice.addProduct(pname, price, qty, sqldate, ct);
		if (status) {
			RequestDispatcher rd = request.getRequestDispatcher("adminProducts");
			rd.forward(request, response);
		}
	}

}
