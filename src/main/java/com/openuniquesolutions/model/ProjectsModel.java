package com.openuniquesolutions.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

public class ProjectsModel {

	private String titile;
	private String company;
	private int teamSize;
	private String[] technologies;
	private String[] points;
	@JsonFormat(shape = Shape.STRING, pattern = "yyyy-mm")
	private Date to;
	@JsonFormat(shape = Shape.STRING, pattern = "yyyy-mm")
	private Date from;
	
	
	
	public ProjectsModel() {
		super();
	}
	public ProjectsModel(String titile, String company, int teamSize, String[] technologies, String[] points, Date to,
			Date from) {
		super();
		this.titile = titile;
		this.company = company;
		this.teamSize = teamSize;
		this.technologies = technologies;
		this.points = points;
		this.to = to;
		this.from = from;
	}
	public String getTitile() {
		return titile;
	}
	public void setTitile(String titile) {
		this.titile = titile;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	public String[] getTechnologies() {
		return technologies;
	}
	public void setTechnologies(String[] technologies) {
		this.technologies = technologies;
	}
	public String[] getPoints() {
		return points;
	}
	public void setPoints(String[] points) {
		this.points = points;
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
	
	
}
