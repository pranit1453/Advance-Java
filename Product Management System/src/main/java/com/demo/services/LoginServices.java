package com.demo.services;

import com.demo.beans.MyUser;

public interface LoginServices {

	MyUser validateUser(String uname, String pass);

}
