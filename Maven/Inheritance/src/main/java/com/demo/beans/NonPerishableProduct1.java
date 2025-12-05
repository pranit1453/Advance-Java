package com.demo.beans;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "npjointable")
public class NonPerishableProduct1 extends Product1 {
	private LocalDate expdate;

	public NonPerishableProduct1() {
		super();
	}

	public NonPerishableProduct1(int pid, String pname, int pqty, double price, LocalDate mfgdate, LocalDate expdate) {
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
		return "NonPerishableProduct1 [expdate=" + expdate + "]";
	}
}
