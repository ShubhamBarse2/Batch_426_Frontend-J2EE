package com.tka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Student {

	public static void main(String[] args) throws Exception {

//		1 . Register & load Driver class 

		Class.forName("com.mysql.cj.jdbc.Driver");

//		2 . get Connection using Connection(I)

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch426", "root", "root");

//		3 . used Statement & PreparedStatement 

		Statement s = con.createStatement();

//     4 . generate Queries  

		int checked = s.executeUpdate("insert into Student(id,name,city)values(125,'shyam','akola')");

		if (checked > 0) {
			System.out.println("data inserted ... !");
		} else {
			System.out.println("data NOT inserted ... !");
		}

//     5 . close all Connection 

		con.close();

	}

}
