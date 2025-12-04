package com.demo.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.Products;
import com.demo.services.ProductService;
import com.demo.services.ProductServiceImpl;

@WebServlet("/editProduct")
public class EditDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int pid = Integer.parseInt(request.getParameter("id"));
		ProductService pservice = new ProductServiceImpl();
		Products p = pservice.getDataToEdit(pid);
		request.setAttribute("p", p);
		if (p != null) {
			RequestDispatcher rd = request.getRequestDispatcher("editProduct.jsp");
			rd.forward(request, response);
		}
	}

}
