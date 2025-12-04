package com.demo.services;

import com.demo.beans.Users;
import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService {
	private LoginDao ldao;

	public LoginServiceImpl() {
		ldao = new LoginDaoImpl();
	}

	@Override
	public Users validateAndShowProduct(String uname, String psw) {
		return ldao.validateAndShowProduct(uname, psw);
	}
}
