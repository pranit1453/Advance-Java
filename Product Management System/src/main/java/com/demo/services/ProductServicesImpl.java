package com.demo.services;

import java.sql.Date;
import java.util.List;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServicesImpl implements ProductServices {
	private ProductDao pdao;

	public ProductServicesImpl() {
		pdao = new ProductDaoImpl();
	}

	@Override
	public List<Product> getAllRecords() {
		return pdao.showAllRecords();
	}

	

	@Override
	public boolean addProduct(String nm, double price, int qty, Date sqlDate) {
		return pdao.addProduct(nm,price,qty,sqlDate);
	}

}
