package com.demo.services;

import java.util.List;

import com.demo.beans.Course;

public interface CourseService {

	boolean insertDataThroughHibernate();

	List<Course> displayData();

}
