package com.demo.dao;

import com.demo.beans.MyUser;

public interface LoginDao {

	MyUser check(String uname, String pass);

}
