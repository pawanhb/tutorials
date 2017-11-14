package com.baeldung.beans;

public class Address {
	private String lane;
	private String street;
	private String city;
	private String zip;
	
	public Address(){}
	
	public Address(String lane, String street, String city, String zip){
		this.lane = lane;
		this.street = street;
		this.city = city;
		this.zip = zip;
	}

	public String getLane() {
		return lane;
	}

	public void setLane(String lane) {
		this.lane = lane;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
}
