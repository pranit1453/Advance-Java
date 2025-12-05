package com.demo.dao;

import java.util.List;

import com.demo.beans.Course;
import com.demo.beans.Faculty;

public interface CourseDao {

	boolean insertDataThroughHibernate(Faculty f1, Course c1);

	List<Course> displayData();

}
