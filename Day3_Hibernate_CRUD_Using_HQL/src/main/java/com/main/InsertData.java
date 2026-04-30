package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Student;

public class InsertData {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "insert into studrecord(address,email,name)values(:add,:email,:name)";
		MutationQuery query = ss.createNativeMutationQuery(hqlQuery);
		query.setParameter("add", "goa");
		query.setParameter("email", "goa@gmail.com");
		query.setParameter("name", "Goa");
		query.executeUpdate();

		tr.commit();
		ss.close();

		System.out.println("Inserted ... !");

	}
}
