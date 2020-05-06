package com.openuniquesolutions.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

public class ExperienceModel {

	private String destination;
	private String company;
	private String discription;
	@JsonFormat(shape = Shape.STRING, pattern = "yyyy-mm")
	private Date toDate;
	@JsonFormat(shape = Shape.STRING, pattern = "yyyy-mm")
	private Date fromDate;
	private String[] technologies;
	
	public ExperienceModel() {
	}
	public ExperienceModel(String destination, String company, String discription, Date toDate, Date fromDate,
			String[] technologies) {
		super();
		this.destination = destination;
		this.company = company;
		this.discription = discription;
		this.toDate = toDate;
		this.fromDate = fromDate;
		this.technologies = technologies;
	}
	
	
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public String[] getTechnologies() {
		return technologies;
	}
	public void setTechnologies(String[] technologies) {
		this.technologies = technologies;
	}
	
}
