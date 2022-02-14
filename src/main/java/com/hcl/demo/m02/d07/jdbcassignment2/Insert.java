package com.hcl.demo.m02.d07.jdbcassignment2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
	Connection con;
	PreparedStatement ps;
	String driver, url;

	String q = "insert into employee(id, name, dob, salary, age) values(?,?,?,?,?)";

	Insert(int id, String name, String dob, int salary, int age) {
		String url = "jdbc:mysql://localhost:3306/demo?useSSL=false";
		String user = "root";
		String password = "abcd1234";

		try {
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(q);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, dob);
			ps.setInt(4, salary);
			ps.setInt(5, age);
			ps.execute();
			System.out.println("Insertion successfull");
			con.close();

		} catch (SQLException e) {
			System.out.println("Error :" + e.getMessage());
		}

	}
}
