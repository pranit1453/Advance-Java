package com.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.LoginDao;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginDao ldao;

	@Override
	public boolean login(String username, String password) {
		return ldao.validate(username, password);
	}
}
