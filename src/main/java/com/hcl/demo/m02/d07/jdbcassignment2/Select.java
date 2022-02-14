package com.hcl.demo.m02.d07.jdbcassignment2;

import java.sql.*;

public class Select {
	Connection con;
	PreparedStatement ps;
	String driver, url;
	ResultSet rs;

	String q = "select * from employee";

	Select() {
		String url = "jdbc:mysql://localhost:3306/demo?useSSL=false";
		String user = "root";
		String password = "abcd1234";

		try {
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(q);
			rs = ps.executeQuery();
			while (!rs.next())
				;
			{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String dob = rs.getString(3);
				int salary = rs.getInt(4);
				int age = rs.getInt(5);
				System.out.println("Selection successfull");

				System.out.println(
						"Id: " + id + ", Name: " + name + ", DOB: " + dob + ", Salary: " + salary + ", Age: " + age);
			}

			rs.close();
			con.close();

		} catch (SQLException e) {
			System.out.println("Error :" + e.getMessage());
		}

	}
}
