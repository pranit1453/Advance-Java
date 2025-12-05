package com.demo.beans;

import java.time.LocalDate;
import java.util.List;

public class Course {
	private int cid;
	private String cname;
	private double cprice;
	private LocalDate joindt;
	private List<Student> stud;

	public Course() {
		super();
	}

	public Course(int cid, String cname, double cprice, LocalDate joindt, List<Student> stud) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cprice = cprice;
		this.joindt = joindt;
		this.stud = stud;
	}

	public Course(int cid, String cname, double cprice, LocalDate joindt) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cprice = cprice;
		this.joindt = joindt;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public double getCprice() {
		return cprice;
	}

	public void setCprice(double cprice) {
		this.cprice = cprice;
	}

	public LocalDate getJoindt() {
		return joindt;
	}

	public void setJoindt(LocalDate joindt) {
		this.joindt = joindt;
	}

	public List<Student> getStud() {
		return stud;
	}

	public void setStud(List<Student> stud) {
		this.stud = stud;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", cprice=" + cprice + ", joindt=" + joindt + ", stud="
				+ stud + "]";
	}

}
