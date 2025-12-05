package com.demo.beans;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pp2")
public class PerishableProduct2 extends Product2 {
	private LocalDate expdate;

	public PerishableProduct2() {
		super();
	}

	public PerishableProduct2(int pid, String pname, int pqty, double price, LocalDate mfgdate, LocalDate expdate) {
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
		return "PerishableProduct2 [expdate=" + expdate + "]";
	}

}
