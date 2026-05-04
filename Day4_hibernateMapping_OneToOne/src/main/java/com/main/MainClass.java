package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Laptop;
import com.entity.Student;

public class MainClass {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Laptop.class);
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Laptop l = new Laptop();
		l.setlName("Dell");
		ss.persist(l);

		Student s = new Student();
		s.setStudId(1002);
		s.setName("Om");
		s.setCity("goa");
		s.setLaptopId(l);

		ss.save(s);

		tr.commit();
		ss.close();

		System.out.println("Data is Inserted... ! ");
	}

}
