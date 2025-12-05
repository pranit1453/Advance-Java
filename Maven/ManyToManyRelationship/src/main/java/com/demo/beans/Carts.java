package com.demo.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "carttable")
public class Carts {
	@Id
	private int cid;
	private int cqty;
	@ManyToMany(mappedBy = "carts")
	private Set<Items> items = new HashSet<>();

	public Carts() {
		super();
	}

	public Carts(int cid, int cqty) {
		super();
		this.cid = cid;
		this.cqty = cqty;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getCqty() {
		return cqty;
	}

	public void setCqty(int cqty) {
		this.cqty = cqty;
	}

	public Set<Items> getItems() {
		return items;
	}

	public void setItems(Set<Items> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Carts [cid=" + cid + ", cqty=" + cqty + ", items=" + items + "]";
	}

}
