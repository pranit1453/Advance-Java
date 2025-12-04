package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.beans.Users;

public class LoginDaoImpl implements LoginDao {
	static Connection conn;
	static {
		conn = DBConnect.getMyConnection();
	}

	@Override
	public Users validateAndShowProduct(String uname, String psw) {
		String query = "Select username,role,email,gender from user where username=? and password=?";
		try (PreparedStatement pst = conn.prepareStatement(query)) {
			pst.setString(1, uname);
			pst.setString(2, psw);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				Users u = new Users(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
				return u;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}
}
