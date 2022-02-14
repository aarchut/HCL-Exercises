package com.hcl.demo.m02.d04.comparatordemo;
import java.util.Comparator;


public class Patient implements Comparable<Patient> {
	private String patientID; 
	private String patientName;
	private int age;
	
	private String doctorID;
	private String doctorName;
	private String specialty;
	
	public int compareTo(Patient h) {
		return this.age - h.age;
	}
	public Patient(String ph, String pnh, int ah) {
		this.patientID = ph; 
		this.patientName = pnh;
		this.age = ah;
	}
	
	public Patient(String dh, String dnh, String sh) {
		this.doctorID = dh;
		this.doctorName = dnh;
		this.specialty = sh;
	}
	
	public String getPatientID() {return patientID; }
	public String getPatientName() {return patientName; }
	public int getAge() { return age; }

	public String getDoctorID() {return doctorID; }
	public String getDoctorName() {return doctorName; }
	public String getSpecialty() { return specialty; }
	
}

class PatientIDCompare implements Comparator<Patient>{
	public int compare(Patient h1, Patient h2) { 
		return h1.getPatientID().compareTo(h2.getPatientID());
		
	}
}

class PatientNameCompare implements Comparator<Patient>{
	public int compare(Patient h1, Patient h2) { 
		return h1.getPatientName().compareTo(h2.getPatientName());
		
	}
}

class ageCompare implements Comparator<Patient>{
	public int compare(Patient h1, Patient h2) { 
		if(h1.getAge() < h2.getAge()) return -1;
		if(h1.getAge() > h2.getAge()) return 1;
		return h1.getPatientName().compareTo(h2.getPatientName());
		
	}
}




 