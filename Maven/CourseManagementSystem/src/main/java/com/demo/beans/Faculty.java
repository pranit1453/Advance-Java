package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "facultyDetailTable") // it gives a name to a table else by default takes class name as table name
public class Faculty {
	@Id // it makes a id as primary key
	@GeneratedValue // it use for an auto increment
	private int facultyid;
	private String facultyname;
	private String specialization;

	public Faculty() {
		super();
	}

	public Faculty(String facultyname, String specialization) {
		super();

		this.facultyname = facultyname;
		this.specialization = specialization;
	}

	public int getFacultyid() {
		return facultyid;
	}

	public String getFacultyname() {
		return facultyname;
	}

	public void setFacultyname(String facultyname) {
		this.facultyname = facultyname;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	@Override
	public String toString() {
		return "Faculty [facultyid=" + facultyid + ", facultyname=" + facultyname + ", specialization=" + specialization
				+ "]";
	}

}
