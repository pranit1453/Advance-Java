package com.demo.beans;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "npSuperTable")
public class NonPerishableProduct3 extends Product3 {
	private LocalDate expdate;

	public NonPerishableProduct3() {
		super();
	}

	public NonPerishableProduct3(int pid, String pname, int pqty, double price, LocalDate mfgdate, LocalDate expdate) {
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
		return "NonPerishableProduct3 [expdate=" + expdate + "]";
	}

}
