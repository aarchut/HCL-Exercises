package com.hcl.demo.m02.d07.jdbcassignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployeeApp {
	
	private static final String QUERY = "select id, name, dob, salary, age from employee where id = 3";
	public static void main(String[] args) {
		
	String url = "jdbc:mysql://localhost:3306/demo?useSSL=false";
    String user = "root";
    String password = "abcd1234";

    //inserting a new employee with all info
     Employee emp =  new Employee(0, "Kate", "10/07/1990", 55_000, 31);

     
    String sql = "INSERT INTO employee(name, dob, salary, age) VALUES(?,?,?,?)";

   
    try (Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = con.prepareStatement(sql,
                    Statement.RETURN_GENERATED_KEYS)) {

        preparedStatement.setString(1, emp.getName());
        preparedStatement.setString(2, emp.getDob());
        preparedStatement.setInt(3, emp.getSalary());
        preparedStatement.setInt(4, emp.getAge());
        preparedStatement.executeUpdate();
        
     

        try (ResultSet resultSet = preparedStatement.getGeneratedKeys()) {

            if (resultSet.first()) {

                System.out.printf("The ID of new student : %d", resultSet.getLong(1));
            }
        }

    } catch (SQLException ex) {

        Logger lgr = Logger.getLogger(EmployeeApp.class.getName());
        lgr.log(Level.SEVERE, ex.getMessage(), ex);
    }
}
}


