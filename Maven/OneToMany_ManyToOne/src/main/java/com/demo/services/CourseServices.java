package com.demo.services;

import java.util.Set;

import com.demo.beans.Course;

public interface CourseServices {

	boolean showOneToMany();

	Set<Course> getData();

}
