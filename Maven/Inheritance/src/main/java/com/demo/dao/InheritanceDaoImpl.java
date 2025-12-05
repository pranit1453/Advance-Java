package com.demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.beans.Product1;
import com.demo.beans.Product2;
import com.demo.beans.Product3;
import com.demo.beans.Products;

public class InheritanceDaoImpl implements InheritanceDao {
	static SessionFactory sf;
	static {
		sf = HibernateConnect.getMySessionFactory();
	}

	@Override
	public boolean showSingleType(Products p1, Products p2) {

		if (sf != null) {
			try (Session session = sf.openSession()) {
				Transaction tr = session.beginTransaction();

				session.save(p1);
				session.save(p2);

				tr.commit();
				return true;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
		return false;
	}

	@Override
	public boolean showJoinType(Product1 p1, Product1 p2) {
		if (sf != null) {
			try (Session session = sf.openSession()) {
				Transaction tr = session.beginTransaction();

				session.save(p1);
				session.save(p2);

				tr.commit();
				return true;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
		return false;
	}

	@Override
	public boolean showMappedBySuperClassType(Product3 p1, Product3 p2) {
		if (sf != null) {
			try (Session session = sf.openSession()) {
				Transaction tr = session.beginTransaction();

				session.save(p1);
				session.save(p2);

				tr.commit();
				return true;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
		return false;
	}

	@Override
	public boolean showTableType(Product2 p1, Product2 p2) {
		if (sf != null) {
			try (Session session = sf.openSession()) {
				Transaction tr = session.beginTransaction();

				session.save(p1);
				session.save(p2);

				tr.commit();
				return true;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
		return false;
	}

	@Override
	public boolean getMySessionFactoryClose() {
		if (sf != null) {
			HibernateConnect.closeMySessionFactory();
			return true;
		}
		return false;
	}
}
