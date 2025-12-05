package com.demo.services;

import java.sql.Date;
import java.util.List;

import com.demo.beans.Product;

public interface ProductServices {

	List<Product> getAllRecords();

	boolean addProduct(String nm, double price, int qty, Date sqlDate);

}
