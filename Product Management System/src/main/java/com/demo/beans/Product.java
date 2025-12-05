package com.demo.beans;

import java.time.LocalDate;

public class Product {
	private int pid;
	private String pname;
	private double price;
	private int qty;
	private LocalDate mgdate;

	public Product() {
		super();
	}

	public Product(int pid, String pname, double price, int qty, LocalDate mgdate) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.qty = qty;
		this.mgdate = mgdate;
	}

	public int getPid() {
		return pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public LocalDate getMgdate() {
		return mgdate;
	}

	public void setMgdate(LocalDate mgdate) {
		this.mgdate = mgdate;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", qty=" + qty + ", mgdate=" + mgdate
				+ "]";
	}

}
