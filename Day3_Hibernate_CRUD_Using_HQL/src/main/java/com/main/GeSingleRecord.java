package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

import jakarta.persistence.Query;

public class GeSingleRecord {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		// select * from student where id = 123

		String hqlQuery = "from Student where id =: id";
		org.hibernate.query.Query<Student> query = ss.createQuery(hqlQuery);
		query.setParameter("id", 1);
		Student s = query.getSingleResult();

		System.out.println(s);

		tr.commit();
		ss.close();
	}
}
