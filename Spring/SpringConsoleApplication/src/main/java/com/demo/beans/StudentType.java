package com.demo.beans;

public class StudentType extends Student {
	private boolean ungraduatestud;
	private boolean posgraduatestud;

	public StudentType() {
		super();
	}

	public StudentType(boolean ungraduatestud, boolean posgraduatestud) {
		super();
		this.ungraduatestud = ungraduatestud;
		this.posgraduatestud = posgraduatestud;
	}

	public StudentType(int sid, String sname, int sage, Course cse, boolean ungraduatestud, boolean posgraduatestud) {
		super(sid, sname, sage, cse);
		this.ungraduatestud = ungraduatestud;
		this.posgraduatestud = posgraduatestud;
	}

	public StudentType(int sid, String sname, int sage, boolean ungraduatestud, boolean posgraduatestud) {
		super(sid, sname, sage);
		this.ungraduatestud = ungraduatestud;
		this.posgraduatestud = posgraduatestud;
	}

	public boolean getUngraduatestud() {
		return ungraduatestud;
	}

	public void setUngraduatestud(boolean ungraduatestud) {
		this.ungraduatestud = ungraduatestud;
	}

	public boolean getPosgraduatestud() {
		return posgraduatestud;
	}

	public void setPosgraduatestud(boolean posgraduatestud) {
		this.posgraduatestud = posgraduatestud;
	}

	@Override
	public String toString() {
		return "StudentType [ungraduatestud=" + ungraduatestud + ", posgraduatestud=" + posgraduatestud + "]";
	}

}
