package com.demo.beans;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ppjointable")
public class PerishableProduct1 extends Product1 {

	private LocalDate expdate;

	public PerishableProduct1() {
		super();
	}

	public PerishableProduct1(int pid, String pname, int pqty, double price, LocalDate mfgdate, LocalDate expdate) {
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
		return "PerishableProduct1 [expdate=" + expdate + "]";
	}

}
