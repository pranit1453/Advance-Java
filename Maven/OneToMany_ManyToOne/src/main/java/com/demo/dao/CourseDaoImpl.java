package com.demo.dao;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.beans.Course;

public class CourseDaoImpl implements CourseDao {
	static SessionFactory sf;
	static {
		sf = HibernateConnect.getMySessionFactory();
	}

	@Override
	public boolean showOneToMany(Course c) {
		if (sf != null) {
			try (Session session = sf.openSession()) {
				Transaction tr = session.beginTransaction();
				session.save(c);
				tr.commit();
				return true;
			} catch (Exception e) {
				System.out.println("Error : " + e.getMessage());
			}
		}

		return false;
	}

	@Override
	public Set<Course> getData(Set<Integer> cids) {
		Set<Course> cset = new HashSet<>();
		if (sf != null) {
			try (Session session = sf.openSession()) {
				Transaction tr = session.beginTransaction();
				for (Integer id : cids) {
					Course cse = session.get(Course.class, id);
					cset.add(cse);
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
