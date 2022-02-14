package com.hcl.demo.m02.d04.comparatordemo;

import java.util.ArrayList;
import java.util.Collections;

public class main {
	
	public main(String[] args) {
		ArrayList<Patient> list = new ArrayList<Patient>();
		list.add(new Patient("A245BFD", "Emily",35 ));
		list.add(new Patient("C7323GH", "Alex", 58));
		list.add(new Patient("J9734SH", "Jake", 20));
		
		ArrayList<Doctor> list2 = new ArrayList<Doctor>();
		list2.add(new Doctor("D9347HR", "Barabara", "Pediatrics"));
		list2.add(new Doctor("E8234FG", "John", "Orthopedics"));
		list2.add(new Doctor("J83456F", "Cara", "Family Medicine"));
		
		
		System.out.println("Sorted by Patient ID: ");
		PatientIDCompare patientIDCompare = new PatientIDCompare();
		Collections.sort(list, patientIDCompare);
		for (Patient patient: list) 
			System.out.print(patient.getPatientID() + " ");
		
		System.out.println();
		
		System.out.println("\nSorted by Patient Name: ");
		PatientNameCompare patientNameCompare = new PatientNameCompare();
		Collections.sort(list, patientNameCompare);
		for (Patient patient: list)
			System.out.print(patient.getPatientName() + " ");
		
		System.out.println();
		
		System.out.println("\nSorted by Patient Age: ");
		ageCompare ageCompare = new ageCompare();
		Collections.sort(list, ageCompare);
		for (Patient patient: list)
			System.out.print(patient.getAge() + " ");
		
		System.out.println();
		
		System.out.println("\nSorted by Doctor ID: ");
		DoctorIDCompare doctorIDCompare = new DoctorIDCompare();
		Collections.sort(list2, doctorIDCompare);
		for (Doctor doctor: list2) 
			System.out.print(doctor.getDoctorID() + " ");
		
		System.out.println();
		
		System.out.println("\nSorted by Doctor Name: ");
		DoctorNameCompare doctorNameCompare = new DoctorNameCompare();
		Collections.sort(list2, doctorNameCompare);
		for (Doctor doctor: list2) 
			System.out.print(doctor.getDoctorName() + " ");
		
		System.out.println();
		
		System.out.println("\nSorted by Doctor Specialty: ");
		SpecialtyCompare specialtyCompare = new SpecialtyCompare();
		Collections.sort(list2, specialtyCompare);
		for (Doctor doctor: list2) 
			System.out.print(doctor.getSpecialty() + " ");
	}

}
