package com.demo.services;

import java.sql.Date;

import java.util.List;
import java.util.Set;

import com.demo.beans.Products;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService {
	private ProductDao pdao;

	public ProductServiceImpl() {
		pdao = new ProductDaoImpl();
	}

	@Override
	public List<Products> getProducts() {
		return pdao.getAllProducts();
	}

	@Override
	public boolean addProduct(String pname, double price, int qty, Date sqldate, String ct) {
		return pdao.addProducts(pname, price, qty, sqldate, ct);
	}

	@Override
	public boolean deleteProduct(int pid) {
		return pdao.deleteProduct(pid);
	}

	@Override
	public boolean updateProduct(int pid, String nm, double price, int qty, Date sqldate, String ct) {
		return pdao.updateProduct(pid, nm, price, qty, sqldate, ct);
	}

	@Override
	public List<Products> getUserProducts() {
		return pdao.getUserProducts();
	}

	@Override
	public List<Products> getCategories() {
		return pdao.getCategory();
	}

	@Override
	public Products getDataToEdit(int pid) {
		return pdao.getDataToEdit(pid);
	}

	@Override
	public Set<Products> getProductsByCategories(String[] selectedCategories) {
		return pdao.selectedProduct(selectedCategories);
	}

}
