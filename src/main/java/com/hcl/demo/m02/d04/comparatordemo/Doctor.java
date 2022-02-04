package com.hcl.demo.m02.d04.comparatordemo;

import java.util.Comparator;

public class Doctor {
	
	private String doctorID;
	private String doctorName;
	private String specialty;
	
	
	
	public Doctor(String dh, String dnh, String sh) {
		this.doctorID = dh;
		this.doctorName = dnh;
		this.specialty = sh;
	}
	

	public String getDoctorID() {return doctorID; }
	public String getDoctorName() {return doctorName; }
	public String getSpecialty() { return specialty; }
	
}

class DoctorIDCompare implements Comparator<Doctor>{
	public int compare(Doctor d1, Doctor d2) { 
		return d1.getDoctorID().compareTo(d2.getDoctorID());
		
	}
}

class DoctorNameCompare implements Comparator<Doctor>{
	public int compare(Doctor d1, Doctor d2) { 
		return d1.getDoctorName().compareTo(d2.getDoctorName());
		
	}
}
class SpecialtyCompare implements Comparator<Doctor>{
	public int compare(Doctor d1, Doctor d2) { 
		return d1.getSpecialty().compareTo(d2.getSpecialty());
		
	}
}



