package com.tka;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class Login extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		PrintWriter out = resp.getWriter();

		resp.setContentType("text/html");

		System.out.println(username);
		System.out.println(password);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch426", "root", "root");
			PreparedStatement ps = c.prepareStatement("select * from students where email =? and password =?");
			ps.setString(1, username);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {

				HttpSession session = req.getSession();
				session.setAttribute("name", rs.getString(2));
				session.setAttribute("city", rs.getString(3));
				session.setAttribute("mobNo", rs.getString(4));
				out.println("Login SuccessFully ... !");
				RequestDispatcher rr = req.getRequestDispatcher("profile.jsp");
				rr.include(req, resp);

			} else {
				out.println("INVALID CREDENTIALS ... !");
				RequestDispatcher rr = req.getRequestDispatcher("register.html");
				rr.include(req, resp);
			}

		} catch (Exception e) {

		}
	}

}
