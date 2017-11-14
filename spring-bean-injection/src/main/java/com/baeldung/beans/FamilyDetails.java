package com.baeldung.beans;

public class FamilyDetails {
	
	private String fatherName;
	private String motherName;
	
	public FamilyDetails(){}
	
	public FamilyDetails(String fatherName, String motherName){
		this.fatherName = fatherName;
		this.motherName = motherName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

}
