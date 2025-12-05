package com.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Course;
import com.demo.beans.Faculty;

public class CourseDaoImpl implements CourseDao {

	@Override
	public boolean insertDataThroughHibernate(Faculty f1, Course c1) {
		try (SessionFactory sf = new Configuration().configure().buildSessionFactory();
				Session session = sf.openSession()) {
			if (session != null) {
				Transaction tr = session.beginTransaction();
				session.save(f1);
				session.save(c1);
				tr.commit();
				return true;
			}

		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
		}
		return false;
	}

	@Override
	public List<Course> displayData() {
		// TODO Auto-generated method stub
		return null;
	}

}
