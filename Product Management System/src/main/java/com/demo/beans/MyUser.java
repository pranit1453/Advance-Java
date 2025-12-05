package com.demo.beans;

public class MyUser {
	private String uname;
	private String role;
	private String email;

	public MyUser() {
		super();
	}

	public MyUser(String uname, String role, String email) {
		super();
		this.uname = uname;
		this.role = role;
		this.email = email;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "MyUser [uname=" + uname + ", role=" + role + ", email=" + email + "]";
	}

}
