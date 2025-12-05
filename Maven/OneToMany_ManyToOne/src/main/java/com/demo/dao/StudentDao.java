package com.demo.dao;

import java.util.Set;

import com.demo.beans.Students;

public interface StudentDao {

	boolean showManyToOne(Students s);

	Set<Students> getData(Set<Integer> sids);

}
