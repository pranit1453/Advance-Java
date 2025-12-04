package com.demo.services;

import java.util.List;

import com.demo.beans.Carts;

public interface CartService {

	boolean addToCart(int pid, String pname, double price, int qty, double total);

	List<Carts> addToCart();

	boolean removeFromCart(int pid);

	List<Carts> getCart();

	

}
