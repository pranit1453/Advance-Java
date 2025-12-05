package com.demo.beans;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("perishable")
public class PerishableProduct extends Products {

	private LocalDate expdate;

	public PerishableProduct() {
		super();
	}

	public PerishableProduct(int pid, String pname, int pqty, double price, LocalDate mfgdate, LocalDate expdate) {
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
		return "PerishableProduct [expdate=" + expdate + "]";
	}

}
