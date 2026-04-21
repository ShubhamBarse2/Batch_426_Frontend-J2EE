package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.entity.Student;

public class StudentDao {

	// CRUD create read update delete with Statement

	public void insertData(Student s) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch426", "root", "root");

		PreparedStatement ps = con.prepareStatement("insert into student(id,name,city)values(?,?,?)");
		ps.setInt(1, s.getId());
		ps.setString(2, s.getName());
		ps.setString(3, s.getCity());

		int checked = ps.executeUpdate();

		if (checked > 0) {
			System.out.println("inserted...");
		} else {
			System.out.println("NOT inserted...");
		}

		con.close();
	}

	public void deleteData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch426", "root", "root");
		PreparedStatement ps = con.prepareStatement("delete from student where id = ?");
		ps.setInt(1, 126);
		int checked = ps.executeUpdate();
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
		PreparedStatement ps = con.prepareStatement("update student set name = ? , city = ? where id = ?");
		ps.setInt(3, 127);
		ps.setString(1, "vraj");
		ps.setString(2, "Mumbai");
		int checked = ps.executeUpdate();
		if (checked > 0) {
			System.out.println("Data updated ... !");
		} else {
			System.err.println("Data NOT updated ... !");
		}
		con.close();
	}

	public void getAllRecord() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch426", "root", "root");
		PreparedStatement ps = con.prepareStatement("select * from student");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "      " + rs.getString(2) + "         " + rs.getString(3));
		}
		con.close();
	}
}
