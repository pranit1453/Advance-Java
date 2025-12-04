package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class StatementTest {

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

			Statement st = conn.createStatement();
			String query = "Select * from dept";
			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
				System.out.println("Dept No : " + rs.getInt(1));
				System.out.println("Dname : " + rs.getString(2));
				System.out.println("LOC : " + rs.getString(3));
				System.out.println("PWD : " + rs.getString(4));
				System.out.println("Startedon : " + rs.getString(5));
				System.out.println("---------------------------------");
			}

			int dno = 105;
			String dname = "Analyst";
			String loc = "Delhi";
			String pwd = "abc124@gmail.com";
			LocalDate ldt = LocalDate.now();
			String sqldate = ldt.toString();

			query = "insert into dept values(" + dno + ",'" + dname + "','" + loc + "','" + pwd + "','" + sqldate
					+ "')";

			System.out.println(query);
			int n = st.executeUpdate(query);
			if (n > 0) {
				System.out.println("Data inserted successfully...");
			} else {
				System.err.println("Failed to insert!!!");
			}

			query = "UPDATE dept SET loc = 'Gujarat' WHERE deptno = 60";
			System.out.println(query);
			int z = st.executeUpdate(query);
			if (z > 0) {
				System.out.println("Data Successfully Updated....");
			} else {
				System.err.println("Failed to update!!!");
			}

			query = "DELETE FROM DEPT WHERE deptno in(100,101,102)";
			int x = st.executeUpdate(query);
			if (x > 0) {
				System.out.println("Deleted Successfully");
			} else {
				System.err.println("Failed to delete!!!");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}

	}

}
