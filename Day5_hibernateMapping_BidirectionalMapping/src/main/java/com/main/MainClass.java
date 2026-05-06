package com.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Department;
import com.entity.Employee;

public class MainClass {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Department.class);
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Department d = new Department();
		d.setDeptName("Java Developer");

		Employee e1 = new Employee();
		e1.setEmpId(1001);
		e1.setEmpName("Ram");
		e1.setCity("pune");
		e1.setDept(d);

		Employee e2 = new Employee();
		e2.setEmpId(1002);
		e2.setEmpName("Raju");
		e2.setCity("goa");
		e2.setDept(d);

		Employee e3 = new Employee();
		e3.setEmpId(1003);
		e3.setEmpName("vraj");
		e3.setCity("nsk");
		e3.setDept(d);

		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);

		d.setEmp(list);

		ss.persist(d);
		ss.persist(e1);
		ss.persist(e2);
		ss.persist(e3);

		tr.commit();
		ss.close();

		System.out.println("Data is Inserted... ! ");
	}

}
