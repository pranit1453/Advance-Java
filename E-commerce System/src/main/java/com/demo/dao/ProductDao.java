package com.demo.dao;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import com.demo.beans.Products;

public interface ProductDao {

	List<Products> getAllProducts();

	boolean addProducts(String pname, double price, int qty, Date sqldate, String ct);

	boolean deleteProduct(int pid);

	boolean updateProduct(int pid, String nm, double price, int qty, Date sqldate, String ct);

	List<Products> getUserProducts();

	List<Products> getCategory();

	Products getDataToEdit(int pid);

	Set<Products> selectedProduct(String[] selectedCategories);

}
