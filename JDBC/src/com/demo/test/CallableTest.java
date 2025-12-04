package com.demo.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableTest {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url = "jdbc:mysql://192.168.10.117:3306/dac54?useSSL=false";
			String user = "dac54";
			String psw = "welcome";
			conn = DriverManager.getConnection(url, user, psw);
			if (conn != null) {
				System.out.println("Connection Establish......");
			} else {
				System.err.println("Connection Failed!!!");
			}

			String query = "call getcnt(?,?)";
			CallableStatement cst = conn.prepareCall(query);
			cst.setInt(1, 10);
			cst.registerOutParameter(2, java.sql.Types.INTEGER);
			cst.execute();
			int cnt = cst.getInt(2);
			System.out.println("Count : " + cnt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
