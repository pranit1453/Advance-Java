package com.demo.services;

import java.util.List;

import com.demo.beans.Carts;
import com.demo.dao.CartDao;
import com.demo.dao.CartDaoImpl;

public class CartServiceImpl implements CartService {
	private CartDao cdao;

	public CartServiceImpl() {
		cdao = new CartDaoImpl();
	}

	@Override
	public boolean addToCart(int pid, String pname, double price, int qty, double total) {
		return cdao.addToCart(pid, pname, price, qty, total);
	}

	@Override
	public List<Carts> addToCart() {
		return cdao.addToCart();
	}

	@Override
	public boolean removeFromCart(int pid) {
		return cdao.removeFromCart(pid);
	}

	@Override
	public List<Carts> getCart() {
		return cdao.getCart();
	}
}
