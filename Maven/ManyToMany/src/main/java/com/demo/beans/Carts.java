package com.demo.beans;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "carttable1")
public class Carts {
	@Id
	private int cartid;
	private double cprice;
	private int cartqty;
	@ManyToMany(mappedBy = "cset", cascade = CascadeType.ALL)
	private Set<Items> iset;

	public Carts() {
		super();
	}

	public Carts(int cartid, double cprice, int cartqty, Set<Items> iset) {
		super();
		this.cartid = cartid;
		this.cprice = cprice;
		this.cartqty = cartqty;
		this.iset = iset;
	}

	public int getCartid() {
		return cartid;
	}

	public void setCartid(int cartid) {
		this.cartid = cartid;
	}

	public double getCprice() {
		return cprice;
	}

	public void setCprice(double cprice) {
		this.cprice = cprice;
	}

	public int getCartqty() {
		return cartqty;
	}

	public void setCartqty(int cartqty) {
		this.cartqty = cartqty;
	}

	public Set<Items> getIset() {
		return iset;
	}

	public void setIset(Set<Items> iset) {
		this.iset = iset;
	}

	@Override
	public String toString() {
		return "Carts [cartid=" + cartid + ", cprice=" + cprice + ", cartqty=" + cartqty + ", iset=" + iset + "]";
	}

}
