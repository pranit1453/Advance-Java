package com.demo.beans;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "productjointable")
@Inheritance(strategy = InheritanceType.JOINED)
public class Product1 {
	@Id
	private int pid;
	private String pname;
	private int pqty;
	private double price;
	private LocalDate mfgdate;

	public Product1() {
		super();
	}

	public Product1(int pid, String pname, int pqty, double price, LocalDate mfgdate) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pqty = pqty;
		this.price = price;
		this.mfgdate = mfgdate;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPqty() {
		return pqty;
	}

	public void setPqty(int pqty) {
		this.pqty = pqty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getMfgdate() {
		return mfgdate;
	}

	public void setMfgdate(LocalDate mfgdate) {
		this.mfgdate = mfgdate;
	}

	@Override
	public String toString() {
		return "Product1 [pid=" + pid + ", pname=" + pname + ", pqty=" + pqty + ", price=" + price + ", mfgdate="
				+ mfgdate + "]";
	}
}
