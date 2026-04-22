package com.tka;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submit")
public class Student extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();

		String id = req.getParameter("id");
		int myId = Integer.parseInt(id);
		String name = req.getParameter("name");
		String city = req.getParameter("city");
		String mobNo = req.getParameter("mobile");
		String email = req.getParameter("email");
		String pass = req.getParameter("password");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch426", "root", "root");
			PreparedStatement ps = c
					.prepareStatement("insert into students(id,name,city,mobile,email,password)values(?,?,?,?,?,?)");
			ps.setInt(1, myId);
			ps.setString(2, name);
			ps.setString(3, city);
			ps.setString(4, mobNo);
			ps.setString(5, email);
			ps.setString(6, pass);
			int checked = ps.executeUpdate();
			if (checked > 0) {
				out.println("<h1 style ='color:green'>" + "Inserted ... !" + "</h1>");
			} else {
				out.println("<h1 style ='color:red'>" + "NOT Inserted ... !" + "</h1>");

				c.close();
			}
		} catch (Exception e) {

		}

//		System.out.println(id);
//		System.out.println(name);
//		System.out.println(city);
//		System.out.println(mobNo);
//		System.out.println(email);
//		System.out.println(pass);
//
//		PrintWriter out = resp.getWriter();
//		out.println(id);
//		out.println(name);
//		out.println(city);
//		out.println(mobNo);
//		out.println(email);
//		out.println(pass);

	}

}
