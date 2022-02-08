package com.hcl.demo.m02.d07.Java8exercise2;
/* 2.Implement a Java program with Stream API
 *  and without the Stream API, consider filter 
 *  condition as for example you had employee list 
 *  filter the employee records whose salary >1000 
 *  $ ,Name Starts with B & D and age > 30 .
 */
import java.util.*;
import java.util.stream.Collectors;

public class Exercise2Main {
	

		public static void main(String[] args) {
			List<EmployeeExercise2> employeeList = new ArrayList<EmployeeExercise2>();
			employeeList.add(new EmployeeExercise2(45, "Barabara", 2000f));
			employeeList.add(new EmployeeExercise2(37, "Barry", 990f));
			employeeList.add(new EmployeeExercise2(26, "Samantha", 1200f));
			employeeList.add(new EmployeeExercise2(31, "Matthew", 1050));
			employeeList.add(new EmployeeExercise2(25, "Danielle", 950f));
			
		
			
			
			Set<Float> employeeSalaryList = employeeList.stream().filter(employee -> employee.salary > 1000f)
					.map(employee -> employee.salary).collect(Collectors.toSet());
			System.out.println("List of salaries greater than $1000: " + employeeSalaryList);
			
			System.out.println();
			Set<String> employeeNameList = employeeList.stream().filter(n -> n.name.startsWith("B"))
					.map(employee -> employee.name).collect(Collectors.toSet());
			System.out.println("List of names starting with 'B': " + employeeNameList);
			
			System.out.println();
			
			Set<String> employeeNameList2 = employeeList.stream().filter(n -> n.name.startsWith("D"))
					.map(employee -> employee.name).collect(Collectors.toSet());
			System.out.println("List of name starting with 'D': " + employeeNameList2);
			
			System.out.println();
			
			Set<Integer> employeeAgeList = employeeList.stream().filter(a-> a.age > 30)
					.map(employee -> employee.age).collect(Collectors.toSet());
			System.out.println("List of ages older than 30: " + employeeAgeList);
			


}
}
