package com.hcl.demo.m02.d07.jdbcassignment2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
	Connection con;
	PreparedStatement ps;
	String driver, url;

	String q = "update employee set name=?, dob=?, salary =?, age=? where id=?";

	Update(int id, String name, String dob, int salary, int age) {

		String url = "jdbc:mysql://localhost:3306/demo?useSSL=false";
		String user = "root";
		String password = "abcd1234";

		try {
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(q);
			ps.setString(1, name);
			ps.setString(2, dob);
			ps.setInt(3, salary);
			ps.setInt(4, age);
			ps.setInt(5, id);

			ps.executeUpdate();
			System.out.println("Update successfull");
			con.close();

		} catch (SQLException e) {
			System.out.println("Error :" + e.getMessage());
		}
	}

}
