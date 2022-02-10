package com.hcl.demo.m02.d07.jdbcassignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtils {
	private static String jdbcURL = "jdbc:mysql://localhost:3306/demo?useSSl=false";
	private static String jdbcUsername = "root";
	private static String jdbcPassword = "abcd1234";
	
	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static void printSQLException(SQLException e) {
		// TODO Auto-generated method stub
		
	}
	

}
