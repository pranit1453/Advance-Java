package com.demo.services;

import com.demo.dao.ItemDao;
import com.demo.dao.ItemdaoImpl;

public class ItemServiceImpl implements ItemService {
	private ItemDao idao;

	public ItemServiceImpl() {
		idao = new ItemdaoImpl();
	}
	
}
