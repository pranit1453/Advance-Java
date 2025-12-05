package com.demo.services;

import com.demo.dao.ResetDao;
import com.demo.dao.ResetDaoImpl;

public class ResetServicesImpl implements ResetServices {
	private ResetDao rdao;

	public ResetServicesImpl() {
		rdao = new ResetDaoImpl();
	}

	@Override
	public boolean resetPsw(String uname, String email, String pass) {

		return rdao.resetPsw(uname, email, pass);
	}
}
