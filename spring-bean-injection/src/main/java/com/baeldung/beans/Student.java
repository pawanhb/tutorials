package com.baeldung.beans;
import com.baeldung.beans.Address;
public class Student {

	private Address address;
	private FamilyDetails familyDetails;
	
	public Student(Address address){
		this.address = address;
	}
	
	public void setFamilyDetails(FamilyDetails familyDetails){
		this.familyDetails = familyDetails;
	}
	
	public void printStudentDetails(){
		System.out.println("Student resides in city " + this.address.getCity());
		if( null != this.familyDetails ){
			System.out.println("Studen's mother name is : " +this.familyDetails.getMotherName());
		}
	}
}
