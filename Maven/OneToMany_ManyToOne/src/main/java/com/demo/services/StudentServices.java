package com.demo.services;

import java.util.Set;

import com.demo.beans.Students;

public interface StudentServices {

	boolean showManyToOne();

	Set<Students> getData();

}
