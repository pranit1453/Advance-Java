package com.demo.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.demo.beans.Products;

public class ProductDaoImpl implements ProductDao {
	static Connection conn;
	static {
		conn = DBConnect.getMyConnection();
	}

	@Override
	public List<Products> getAllProducts() {
		List<Products> plist = new ArrayList<>();
		String query = "Select * from MyProduct";
		try (PreparedStatement pst = conn.prepareStatement(query)) {
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				plist.add(new Products(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4),
						rs.getDate(5).toLocalDate(), rs.getString(6)));
			}
			return plist;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean addProducts(String pname, double price, int qty, Date sqldate, String ct) {
		String query = "insert into MyProduct (pname,price,qty,date,category) values (?,?,?,?,?)";
		try (PreparedStatement pst = conn.prepareStatement(query)) {
			pst.setString(1, pname);
			pst.setDouble(2, price);
			pst.setInt(3, qty);
			pst.setDate(4, sqldate);
			pst.setString(5, ct);

			int n = pst.executeUpdate();
			return n > 0;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteProduct(int pid) {
		String query = "delete from MyProduct where pid=?";
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
	public boolean updateProduct(int pid, String nm, double price, int qty, Date sqldate, String ct) {
		String query = "Update MyProduct Set pname=?,price=?,qty=?,date=?,category=? where pid=?";
		try (PreparedStatement pst = conn.prepareStatement(query)) {
			pst.setString(1, nm);
			pst.setDouble(2, price);
			pst.setInt(3, qty);
			pst.setDate(4, sqldate);
			pst.setString(5, ct);
			pst.setInt(6, pid);
			int n = pst.executeUpdate();
			return n > 0;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Products> getUserProducts() {
		List<Products> plist = new ArrayList<>();
		String query = "Select * from MyProduct";
		try (PreparedStatement pst = conn.prepareStatement(query)) {
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				plist.add(new Products(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4),
						rs.getDate(5).toLocalDate(), rs.getString(6)));
			}
			return plist;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Products> getCategory() {
		List<Products> pcat = new ArrayList<>();
		String query = "Select Distinct category from MyProduct";
		try (PreparedStatement pst = conn.prepareStatement(query)) {
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				pcat.add(new Products(rs.getString(1)));
			}
			return pcat;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Products getDataToEdit(int pid) {
		String query = "Select pid,pname,price,qty,date,category from MyProduct where pid=?";
		try (PreparedStatement pst = conn.prepareStatement(query)) {
			pst.setInt(1, pid);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				return new Products(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4),
						rs.getDate(5).toLocalDate(), rs.getString(6));
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Set<Products> selectedProduct(String[] selectedCategories) {
		Set<Products> scat = new HashSet<>();
		if (selectedCategories == null || selectedCategories.length == 0) {
			return scat;
		}
		StringBuilder query = new StringBuilder(
				"Select pid,pname,price,qty,date,category from MyProduct where category IN(");
		for (int i = 0; i < selectedCategories.length; i++) {
			query.append("?");
			if (i < selectedCategories.length - 1) {
				query.append(", ");
			}
		}
		query.append(")");
		try (PreparedStatement pst = conn.prepareStatement(query.toString())) {
			for (int i = 0; i < selectedCategories.length; i++) {
				pst.setString(i + 1, selectedCategories[i]);
			}
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				scat.add(new Products(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4),
						rs.getDate(5).toLocalDate(), rs.getString(6)));
			}
			return scat;

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

}
