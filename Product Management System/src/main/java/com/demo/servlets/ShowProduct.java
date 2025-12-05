package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.MyUser;
import com.demo.beans.Product;
import com.demo.services.ProductServices;
import com.demo.services.ProductServicesImpl;

public class ShowProduct extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		// check whether session exist or not
		HttpSession session = request.getSession();
		MyUser user = (MyUser) session.getAttribute("user");
		if (user != null && user.getRole().equals("user")) {
			ProductServices pservices = new ProductServicesImpl();
			List<Product> plist = pservices.getAllRecords();
			out.println(
					"<table border='1'><tr><th>ID</th><th>NAME</th><th>PRICE</th><th>QUANTITY</th><th>DATE</th><th>ACTION</th></tr>");
			for (Product p : plist) {
				out.println("<tr><td>" + p.getPid() + "</td><td>" + p.getPname() + "</td><td>" + p.getPrice()
						+ "</td><td>" + p.getQty() + "</td><td>" + p.getMgdate() + "</td>");
				out.println("<td><a href='deleteproduct?pid=" + p.getPid() + "'>Delete</a> | <a href='editproduct?pid="
						+ p.getPid() + "'>Edit</a></td>");
			}
			out.println("</table>");
			out.println("<a href='addproduct.html'>Add New Product</a>");
		} else {
			out.println("<h4>Unauthorized Access!!!</h4>");
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}

	}

}
