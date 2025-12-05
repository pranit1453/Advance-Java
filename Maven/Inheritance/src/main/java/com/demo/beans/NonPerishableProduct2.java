package com.demo.beans;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "npp2")
public class NonPerishableProduct2 extends Product2 {
	private LocalDate expdate;

	public NonPerishableProduct2() {
		super();
	}

	public NonPerishableProduct2(int pid, String pname, int pqty, double price, LocalDate mfgdate, LocalDate expdate) {
		super(pid, pname, pqty, price, mfgdate);
		this.expdate = expdate;
	}

	public LocalDate getExpdate() {
		return expdate;
	}

	public void setExpdate(LocalDate expdate) {
		this.expdate = expdate;
	}

	@Override
	public String toString() {
		return "NonPerishableProduct2 [expdate=" + expdate + "]";
	}
}
