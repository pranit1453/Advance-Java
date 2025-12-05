package com.demo.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Product;

public class ProductDaoImpl implements ProductDao {
	static Connection conn;
	static PreparedStatement pstretrieve;
	static {
		conn = DBConnect.getMyConnection();
		try {
			pstretrieve = conn.prepareStatement("Select * from MyProduct");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	@Override
	public List<Product> showAllRecords() {
		List<Product> plist = new ArrayList<>();
		try {
			ResultSet rs = pstretrieve.executeQuery();
			while (rs.next()) {
				plist.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4),
						rs.getDate(5).toLocalDate()));
			}
			return plist;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean addProduct(String nm, double price, int qty, Date sqlDate) {
		String query = "insert into MyProduct(pname,price,qty,date) values(?,?,?,?)";
		try (PreparedStatement pst = conn.prepareStatement(query)) {
			pst.setString(1, nm);
			pst.setDouble(2, price);
			pst.setInt(3, qty);
			pst.setDate(4, sqlDate);

			int n = pst.executeUpdate();
			return n > 0;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
