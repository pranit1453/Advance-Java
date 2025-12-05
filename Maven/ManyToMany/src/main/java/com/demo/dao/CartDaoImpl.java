package com.demo.dao;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Carts;
import com.demo.beans.Items;

public class CartDaoImpl implements CartDao {
	static SessionFactory sf;
	static {
		sf = new Configuration().configure().buildSessionFactory();
	}

	@Override
	public boolean showManyToMany(Set<Items> iset, Set<Carts> cset) {
		if (sf != null) {
			try (Session session = sf.openSession()) {
				Transaction tr = session.beginTransaction();

				for (Items i : iset) {
					session.save(i);
				}
				for (Carts c : cset) {
					session.save(c);
				}
				tr.commit();
				return true;
			} catch (Exception e) {
				System.out.println("Error : " + e.getMessage());
			}
		}
		return false;
	}

	@Override
	public Set<Carts> getData(Set<Integer> cids) {
		Set<Carts> cset = new HashSet<>();
		if (sf != null) {
			try (Session session = sf.openSession()) {
				Transaction tr = session.beginTransaction();

				for (Integer id : cids) {
					Carts c = session.get(Carts.class, id);
					cset.add(c);
				}
				tr.commit();
				return cset;
			} catch (Exception e) {
				System.out.println("Error : " + e.getMessage());
			}
		}
		return null;
	}
}
