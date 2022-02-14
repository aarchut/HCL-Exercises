package com.hcl.demo.m02.d07.jdbcassignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

	public static void main(String[] args) throws IOException {

		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);

		int menNum, id, salary, age;
		String name, dob;

		System.out.println("1. Select Records");
		System.out.println("2. Insert Records");
		System.out.println("3. Update Records");
		System.out.println("4. Delete Records");
		System.out.println("Select an option: ");
		menNum = Integer.parseInt(br.readLine());
		switch (menNum) {
		case 1:
			System.out.println("Select Records");
			System.out.println("Enter id: ");
			id = Integer.parseInt(br.readLine());
			new Select();
			break;
		case 2:
			System.out.println("Insert Records");
			System.out.println("Enter id: ");
			id = Integer.parseInt(br.readLine());
			System.out.println("Enter Name: ");
			name = br.readLine();
			System.out.println("Eneter DOB: ");
			dob = br.readLine();
			System.out.println("Enter Salary: ");
			salary = Integer.parseInt(br.readLine());
			System.out.println("Enter Age: ");
			age = Integer.parseInt(br.readLine());
			new Insert(id, name, dob, salary, age);
			break;
		case 3:
			System.out.println("Update Records");
			System.out.println("Enter original id: ");
			id = Integer.parseInt(br.readLine());
			System.out.println("Enter updated name: ");
			name = br.readLine();
			System.out.println("Enter updated dob: ");
			dob = br.readLine();
			System.out.println("Enter updated salary: ");
			salary = Integer.parseInt(br.readLine());
			System.out.print("Enter updated age: ");
			age = Integer.parseInt(br.readLine());
			new Update(id, name, dob, salary, age);
			break;
		case 4:
			System.out.println("Delete Records ");
			System.out.println("Enter id:");
			id = Integer.parseInt(br.readLine());
			new Delete(id);
		}

	}

}
