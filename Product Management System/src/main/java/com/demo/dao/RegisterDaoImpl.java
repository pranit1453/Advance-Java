package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDaoImpl implements RegisterDao {
	static Connection conn;
	static {
		conn = DBConnect.getMyConnection();
	}

	@Override
	public boolean register(String uname, String pass, String email, String gender, String role) {
		String sql = "INSERT INTO user (username, password, role, email, gender) VALUES (?, ?, ?, ?, ?)";
		try (PreparedStatement pst = conn.prepareStatement(sql)) {
			pst.setString(1, uname);
			pst.setString(2, pass);
			pst.setString(3, role);
			pst.setString(4, email);
			pst.setString(5, gender);
			int n = pst.executeUpdate();

			return n > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
