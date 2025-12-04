package com.demo.services;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import com.demo.beans.Products;

public interface ProductService {

	List<Products> getProducts();

	boolean addProduct(String pname, double price, int qty, Date sqldate, String ct);

	boolean deleteProduct(int pid);

	boolean updateProduct(int pid, String nm, double price, int qty, Date sqldate, String ct);

	List<Products> getUserProducts();

	List<Products> getCategories();

	Products getDataToEdit(int pid);

	Set<Products> getProductsByCategories(String[] selectedCategories);

}
