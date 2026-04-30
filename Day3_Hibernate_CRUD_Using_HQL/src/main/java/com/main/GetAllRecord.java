package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

import jakarta.persistence.Query;

public class GetAllRecord {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		// select * from student;

		String hqlQuery = "from Student";

		org.hibernate.query.Query<Student> query = ss.createQuery(hqlQuery);
		List<Student> list = query.list();

//		Query query1 = ss.createQuery(hqlQuery);
//		List<Student> list = query1.getResultList();

		for (Student sdt : list) {
			System.out.println(sdt);
		}

		tr.commit();
		ss.close();

	}

}
