package com.demo.beans;

public class Carts {
	private int pid;
	private String pname;
	private double price;
	private int qty;
	private double total;

	public Carts() {
		super();
	}

	public Carts(int pid, String pname, double price, int qty, double total) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.qty = qty;
		this.total = total;
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

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Carts [pid=" + pid + ", pname=" + pname + ", price=" + price + ", qty=" + qty + ", total=" + total
				+ "]";
	}

}
