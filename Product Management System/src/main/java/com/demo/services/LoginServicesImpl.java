package com.demo.services;

import com.demo.beans.MyUser;
import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImpl;

public class LoginServicesImpl implements LoginServices {
	private LoginDao ldao;

	public LoginServicesImpl() {
		ldao = new LoginDaoImpl();
	}

	@Override
	public MyUser validateUser(String uname, String pass) {
		return ldao.check(uname, pass);
	}
}
