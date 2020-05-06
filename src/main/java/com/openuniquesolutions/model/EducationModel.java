package com.openuniquesolutions.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

public class EducationModel {
	
	private String degree;
	private String schoolName;
	private String specification;
	private String location;
	@JsonFormat(shape = Shape.STRING, pattern = "yyyy-mm")
	private Date to;
	@JsonFormat(shape = Shape.STRING, pattern = "yyyy-mm")
	private Date from;
	private float percerntage_ctc;
	
	
	public EducationModel() {
	}
	public EducationModel(String degree, String schoolName, String specification, String location, Date to, Date from,
			float percerntage_ctc) {
		this.degree = degree;
		this.schoolName = schoolName;
		this.specification = specification;
		this.location = location;
		this.to = to;
		this.from = from;
		this.percerntage_ctc = percerntage_ctc;
	}
	
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getSpecification() {
		return specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getTo() {
		return to;
	}
	public void setTo(Date to) {
		this.to = to;
	}
	public Date getFrom() {
		return from;
	}
	public void setFrom(Date from) {
		this.from = from;
	}
	public float getPercerntage_ctc() {
		return percerntage_ctc;
	}
	public void setPercerntage_ctc(float percerntage_ctc) {
		this.percerntage_ctc = percerntage_ctc;
	}
	
	

}
