package com.demo.dao;

import java.sql.Date;
import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	List<Product> showAllRecords();

	boolean addProduct(String nm, double price, int qty, Date sqlDate);

	

}
