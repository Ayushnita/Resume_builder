package com.openuniquesolutions.model;

public class SkillsModel {

	private String type;
	private String skillName;
	private float ratting;
	
	
	public SkillsModel() {
	}
	public SkillsModel(String type, String skillName, float ratting) {
		this.type = type;
		this.skillName = skillName;
		this.ratting = ratting;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public float getRatting() {
		return ratting;
	}
	public void setRatting(float ratting) {
		this.ratting = ratting;
	}
	@Override
	public String toString() {
		return "SkillsModel [type=" + type + ", skillName=" + skillName + ", ratting=" + ratting + "]";
	}
		
}
