package com.openuniquesolutions.model;



public class GeneralDetailsModel {

	private String name;
	private String email;
	private String mobileNumber;
	private String location;
	
	public GeneralDetailsModel() {
		super();
	}
	public GeneralDetailsModel(String name, String email, String mobileNumber, String location) {
		super();
		this.name = name;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}	
}
