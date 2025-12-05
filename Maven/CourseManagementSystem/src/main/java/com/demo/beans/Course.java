package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "courseDetailTable") // it gives a name to a table else by default takes class name as table name
public class Course {
	@Id
	@GeneratedValue
	private int courseid;
	private String coursename;
	private int duration;
	@OneToOne(fetch = FetchType.LAZY) // fetch lazy will avoid join query because OneToOne by default takes join
										// query.
	@JoinColumn(name = "facid") // it change the column name
	private Faculty faculty;

	public Course() {
		super();
	}

	public Course(String coursename, int duration, Faculty faculty) {
		super();

		this.coursename = coursename;
		this.duration = duration;
		this.faculty = faculty;
	}

	public int getCourseid() {
		return courseid;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", coursename=" + coursename + ", duration=" + duration + ", faculty="
				+ faculty + "]";
	}

}
