package com.demo.services;

import java.util.Set;

import com.demo.beans.Carts;

public interface CartService {

	boolean showManyToMany();

	Set<Carts> getData();

}
