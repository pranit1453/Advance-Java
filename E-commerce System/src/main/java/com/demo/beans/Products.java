package com.demo.beans;

import java.time.LocalDate;
import java.util.Objects;

public class Products {
	private int pid;
	private String pname;
	private double price;
	private int qty;
	private LocalDate ldt;
	private String category;

	public Products() {
		super();
	}

	public Products(int pid, String pname, double price, int qty, LocalDate ldt, String category) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.qty = qty;
		this.ldt = ldt;
		this.category = category;
	}

	public Products(String category) {
		this.category = category;
	}

	public Products(String pname, double price, int qty, LocalDate ldt, String category) {
		this.pname = pname;
		this.price = price;
		this.qty = qty;
		this.ldt = ldt;
		this.category = category;
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

	public LocalDate getLdt() {
		return ldt;
	}

	public void setLdt(LocalDate ldt) {
		this.ldt = ldt;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public int hashCode() {
		return Objects.hash(category);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Products other = (Products) obj;
		return Objects.equals(category, other.category);
	}

	@Override
	public String toString() {
		return "Products [pid=" + pid + ", pname=" + pname + ", price=" + price + ", qty=" + qty + ", ldt=" + ldt
				+ ", category=" + category + "]";
	}

}
