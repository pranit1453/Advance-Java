package com.demo.dao;

import java.util.Set;

import com.demo.beans.Carts;
import com.demo.beans.Items;

public interface ManyToManyDao {

	boolean showManyToMany(Set<Items> items);

	Set<Carts> getData(Set<Integer> cids);

}
