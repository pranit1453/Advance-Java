package com.demo.dao;

import com.demo.beans.Users;

public interface LoginDao {

	Users validateAndShowProduct(String uname, String psw);

}
