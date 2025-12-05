package com.demo.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "itemtable")
public class Items {
	@Id
	private int iid;
	private String iname;
	private int iqty;
	private double iprice;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "cart_item", joinColumns = @JoinColumn(name = "cart_id"), inverseJoinColumns = @JoinColumn(name = "item_id"))
	private Set<Carts> carts = new HashSet<>();

	public Items() {
		super();
	}

	public Items(int iid, String iname, int iqty, double iprice) {
		super();
		this.iid = iid;
		this.iname = iname;
		this.iqty = iqty;
		this.iprice = iprice;
	}

	public int getIid() {
		return iid;
	}

	public void setIid(int iid) {
		this.iid = iid;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}

	public int getIqty() {
		return iqty;
	}

	public void setIqty(int iqty) {
		this.iqty = iqty;
	}

	public double getIprice() {
		return iprice;
	}

	public void setIprice(double iprice) {
		this.iprice = iprice;
	}

	public Set<Carts> getCarts() {
		return carts;
	}

	public void setCarts(Set<Carts> carts) {
		this.carts = carts;
	}

	@Override
	public String toString() {
		return "Items [iid=" + iid + ", iname=" + iname + ", iqty=" + iqty + ", iprice=" + iprice + "]";
	}

}
