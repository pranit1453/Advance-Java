package com.demo.beans;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CourseTable")
// course has a list of student
public class Course {
	@Id
	private int cid;
	@Column(name="Name")
	private String cname;
	private LocalDate startdate;
	private Set<Student> stud;

	public Course() {
		super();
	}

	public Course(int cid, String cname, LocalDate startdate, Set<Student> stud) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.startdate = startdate;
		this.stud = stud;
	}

	public Course(int cid, String cname, LocalDate startdate) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.startdate = startdate;
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

	public LocalDate getStartdate() {
		return startdate;
	}

	public void setStartdate(LocalDate startdate) {
		this.startdate = startdate;
	}

	public Set<Student> getStud() {
		return stud;
	}

	public void setStud(Set<Student> stud) {
		this.stud = stud;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", startdate=" + startdate + ", stud=" + stud + "]";
	}

}
