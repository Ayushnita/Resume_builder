package com.openuniquesolutions.model;

import java.util.List;

public class AreaOfIntrestModel {

	private List<String> areaOfIntrests;

	public AreaOfIntrestModel() {
		super();
	}

	public AreaOfIntrestModel(List<String> areaOfIntrests) {
		super();
		this.areaOfIntrests = areaOfIntrests;
	}

	public List<String> getAreaOfIntrests() {
		return areaOfIntrests;
	}

	public void setAreaOfIntrests(List<String> areaOfIntrests) {
		this.areaOfIntrests = areaOfIntrests;
	}
	
	public void setAreaOfIntrests(String a) {
		this.areaOfIntrests.add(a);
	}

	@Override
	public String toString() {
		String areaOfIntrestsString = "";
		for (String s : this.areaOfIntrests) {
			areaOfIntrestsString = areaOfIntrestsString + " " + s;
		}
		return areaOfIntrestsString;
	}
	
}
