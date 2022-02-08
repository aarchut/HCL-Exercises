package com.hcl.demo.m02.d07.jdbcassignment;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//selecting rows based off id 

public class SelectPStatment {
	private static final String QUERY = "select id, name, dob, salary, age from employee where id = ?";
	
	public static void main(String [] args)  {
		
		try(Connection connection = JDBCUtils.getConnection();
				
				PreparedStatement preparedStatement = connection.prepareStatement(QUERY);) {
			preparedStatement.setInt(1,4);
			System.out.println(preparedStatement);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String dob = rs.getString("dob");
				int salary = rs.getInt("salary");
				int age = rs.getInt("age");
				System.out.println(id + "," + name + "," + dob + "," + salary + "," + age);
			
			}
		} catch (SQLException e) {
			JDBCUtils.printSQLException(e);
			
		}
	}

}
