
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

@WebServlet("/edit")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int pid = Integer.parseInt(request.getParameter("id"));
		String nm = request.getParameter("nm");
		double price = Double.parseDouble(request.getParameter("price"));
		int qty = Integer.parseInt(request.getParameter("qty"));
		String dt = request.getParameter("dt");
		java.sql.Date sqldate = java.sql.Date.valueOf(dt);
		String ct = request.getParameter("ct");

		ProductService pservice = new ProductServiceImpl();
		boolean status = pservice.updateProduct(pid, nm, price, qty, sqldate, ct);
		if (status) {
			RequestDispatcher rd = request.getRequestDispatcher("adminProducts");
			rd.forward(request, response);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

}
