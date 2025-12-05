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
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}

			String url = "jdbc:mysql://192.168.10.117:3306/dac54?useSSlL=false";
			String user = "dac54";
			String psw = "welcome";
			try {
				conn = DriverManager.getConnection(url, user, psw);
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			if (conn != null) {
				System.out.println("Connection Established.....");
			} else {
				System.err.println("Connection Failed!!!");
			}
		}

		return conn;
	}

	public static void closeMyConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
