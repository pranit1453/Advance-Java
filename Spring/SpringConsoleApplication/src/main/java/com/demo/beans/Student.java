package com.demo.beans;

public class Student {
	private int sid;
	private String sname;
	private int sage;
	private Course cse;

	public Student() {
		super();
	}

	public Student(int sid, String sname, int sage, Course cse) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.cse = cse;
	}

	public Student(int sid, String sname, int sage) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	public Course getCse() {
		return cse;
	}

	public void setCse(Course cse) {
		this.cse = cse;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + "]";
	}

}
