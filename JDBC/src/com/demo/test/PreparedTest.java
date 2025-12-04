package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class PreparedTest {

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

			PreparedStatement pst = conn.prepareStatement("select * from dept");
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				System.out.println("Dept No : " + rs.getInt(1));
				System.out.println("Dname : " + rs.getString(2));
				System.out.println("LOC : " + rs.getString(3));
				System.out.println("PWD : " + rs.getString(4));
				System.out.println("Startedon : " + rs.getString(5));
				System.out.println("---------------------------------");
			}

			String query = "insert into dept values(?,?,?,?,?)";
			PreparedStatement pst1 = conn.prepareStatement(query);
			int dno = 104;
			String dname = "Analyst";
			String loc = "Delhi";
			String pwd = "abc124@gmail.com";
			LocalDate ldt = LocalDate.now();
			// String sqldate = ldt.toString();

			pst1.setInt(1, dno);
			pst1.setString(2, dname);
			pst1.setString(3, loc);
			pst1.setString(4, pwd);
			pst1.setDate(5, java.sql.Date.valueOf(ldt));

			int n = pst1.executeUpdate();
			if (n > 0) {
				System.out.println("Data inserted....");
			} else {
				System.err.println("Failed to insert!!!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
