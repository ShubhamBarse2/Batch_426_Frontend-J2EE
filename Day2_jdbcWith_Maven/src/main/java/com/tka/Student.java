package com.tka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Student {

	// CRUD create read update delete with Statement

	public void insertData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch426", "root", "root");
		Statement s = con.createStatement();
		int checked = s.executeUpdate("insert into student(id,name,city)values(126,'rahul','goa')");
		if (checked > 0) {
			System.out.println("Data inserted ... !");
		} else {
			System.err.println("Data NOT inserted ... !");
		}
		con.close();
	}

	public void deleteData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch426", "root", "root");
		Statement s = con.createStatement();
		int checked = s.executeUpdate("delete from student where id = 126");
		if (checked > 0) {
			System.out.println("Data deleted ... !");
		} else {
			System.err.println("Data NOT deleted ... !");
		}
		con.close();

	}

	public void updateData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch426", "root", "root");
		Statement s = con.createStatement();
		int checked = s.executeUpdate("update student set name ='Praful' city = 'nsk' where id = 125");
		if (checked > 0) {
			System.out.println("Data updated ... !");
		} else {
			System.err.println("Data NOT updated ... !");
		}
		con.close();
	}
}
