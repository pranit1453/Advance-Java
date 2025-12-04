package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Carts;

public class CartDaoImpl implements CartDao {
	static Connection conn;
	static {
		conn = DBConnect.getMyConnection();
	}

	@Override
	public boolean addToCart(int pid, String pname, double price, int qty, double total) {
		String query = "insert into cart (pid,pname,price,qty,total) values(?,?,?,?,?)";
		try (PreparedStatement pst = conn.prepareStatement(query)) {
			pst.setInt(1, pid);
			pst.setString(2, pname);
			pst.setDouble(3, price);
			pst.setInt(4, qty);
			pst.setDouble(5, total);

			int n = pst.executeUpdate();
			return n > 0;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Carts> addToCart() {
		List<Carts> clist = new ArrayList<>();
		String query = "Select pid,pname,price,qty,total from cart";
		try (PreparedStatement pst = conn.prepareStatement(query)) {
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				clist.add(new Carts(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4), rs.getDouble(5)));
			}
			return clist;

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean removeFromCart(int pid) {
		String query = "delete from cart where pid=?";
		try (PreparedStatement pst = conn.prepareStatement(query)) {
			pst.setInt(1, pid);
			int n = pst.executeUpdate();
			return n > 0;

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Carts> getCart() {

		List<Carts> cartlist = new ArrayList<>();
		String query = "Select * from cart";
		try (PreparedStatement pst = conn.prepareStatement(query)) {
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				cartlist.add(new Carts(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4), rs.getDouble(5)));
			}
			return cartlist;

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

}
