package com.demo.services;

import com.demo.dao.RegisterDao;
import com.demo.dao.RegisterDaoImpl;

public class RegisterServicesImpl implements RegisterServices {
	private RegisterDao rdao;

	public RegisterServicesImpl() {
		rdao = new RegisterDaoImpl();
	}

	@Override
	public boolean registerUser(String uname, String pass, String email, String gender, String role) {

		return rdao.register(uname, pass, email, gender, role);
	}
}
