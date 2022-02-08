package com.hcl.demo.m02.d07.stream;

import java.util.*;
import java.util.stream.Collectors;


public class StreamExample {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(45, "Barabara", 50000f));
		employeeList.add(new Employee(37, "Jimmy", 55000f));
		employeeList.add(new Employee(26, "Samantha", 47000f));
		employeeList.add(new Employee(31, "Matthew", 55000f));
		employeeList.add(new Employee(25, "Catherine", 56000f));
		employeeList.stream().filter(p ->p.salary > 50000f)
		.map(pm -> pm.salary)
		.forEach(System.out::println);
		
		System.out.println();
		
		Set<Float> employeeSalaryList = employeeList.stream().filter(employee -> employee.salary > 50000)
				.map(employee -> employee.salary).collect(Collectors.toSet());
		System.out.println(employeeSalaryList);
		
	}
}
