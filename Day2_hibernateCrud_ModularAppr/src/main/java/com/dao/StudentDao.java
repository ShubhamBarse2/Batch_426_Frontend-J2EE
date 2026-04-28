package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class StudentDao {

	public String insertData(Student s) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		s.setName("mayuresh");
		s.setCity("goa");
		s.setEmail("mayuresh@gmail.com");

//		ss.save(s);
		ss.persist(s);
		tr.commit();
		ss.close();

		return "Inserted ... !";

	}

	public void deleteData() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int id = 4;
		Student s = ss.get(Student.class, id);

//		ss.delete(s);
		ss.remove(s);

		tr.commit();
		ss.close();
		System.out.println("deleted...!");

	}

	public void updateData() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int id = 2;
		Student s = ss.get(Student.class, id);
		s.setCity("nagpur");
		s.setEmail("vraj@gmail.com");
		s.setName("Vraj");

//		ss.update(s);
		ss.merge(s);

		tr.commit();
		ss.close();
		System.out.println("updated...!");

	}

	public void getSingleRecord() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int id = 2;
		Student s = ss.get(Student.class, id);
		System.out.println(s);

		tr.commit();
		ss.close();
	}
}
