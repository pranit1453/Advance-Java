package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.beans.MyUser;

public class LoginDaoImpl implements LoginDao {
	static Connection conn;
	static PreparedStatement pstvalidate;
	static {

		try {
			conn = DBConnect.getMyConnection();
			pstvalidate = conn
					.prepareStatement("select username,role,email from user where username=? and password=?");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	@Override
	public MyUser check(String uname, String pass) {
		try {
			pstvalidate.setString(1, uname);
			pstvalidate.setString(2, pass);
			ResultSet rs = pstvalidate.executeQuery();
			if (rs.next()) {
				MyUser user = new MyUser(rs.getString(1), rs.getString(2), rs.getString(3));
				return user;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}
}
