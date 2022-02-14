package com.hcl.demo.m02.d07.jdbcassignment2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
	Connection con;
	PreparedStatement ps;
	String driver, url;
	String q = "delete from employee where id = ?";

	Delete(int id) {

		String url = "jdbc:mysql://localhost:3306/demo?useSSL=false";
		String user = "root";
		String password = "abcd1234";

		try {
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(q);
			ps.setInt(1, id);
			ps.execute();
			System.out.println("Deletion successfull");
			con.close();

		} catch (SQLException e) {
			System.out.println("Error :" + e.getMessage());
		}

	}
}
