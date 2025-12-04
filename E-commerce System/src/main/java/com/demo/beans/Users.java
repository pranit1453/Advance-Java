package com.demo.beans;

public class Users {
	private String username;
	private String role;
	private String email;
	private String gender;

	public Users() {
		super();
	}

	public Users(String username, String role, String email, String gender) {
		super();
		this.username = username;
		this.role = role;
		this.email = email;
		this.gender = gender;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Users [username=" + username + ", role=" + role + ", email=" + email + ", gender=" + gender + "]";
	}

}
