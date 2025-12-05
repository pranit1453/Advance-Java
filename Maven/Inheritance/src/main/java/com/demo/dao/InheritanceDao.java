package com.demo.dao;

import com.demo.beans.Product1;
import com.demo.beans.Product2;
import com.demo.beans.Product3;
import com.demo.beans.Products;

public interface InheritanceDao {

	boolean showSingleType(Products p1, Products p2);

	boolean showJoinType(Product1 p1, Product1 p2);

	boolean showMappedBySuperClassType(Product3 p1, Product3 p2);

	boolean showTableType(Product2 p1, Product2 p2);

	boolean getMySessionFactoryClose();

}
