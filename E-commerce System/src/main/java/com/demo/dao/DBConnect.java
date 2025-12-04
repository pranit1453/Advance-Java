package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	static Connection conn = null;

	public static Connection getMyConnection() {
		if (conn == null) {
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String url = "jdbc:mysql://192.168.10.117:3306/dac54?useSSL=false";
				String user = "dac54";
				String psw = "welcome";
				conn = DriverManager.getConnection(url, user, psw);
				if (conn != null) {
					System.out.println("Connection Established......");
				} else {
					System.err.println("Failed to establish connection!!!!");
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}

		return conn;
	}

	public static boolean closeMyConnection() {
		if (conn != null) {
			try {
				conn.close();
				return true;
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		return false;
	}
}
