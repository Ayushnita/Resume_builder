package com.openuniquesolutions.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("userresume")
public class UserModel {

	@Id
	@Indexed
	@Field("id")
	private final String userId;
	private GeneralDetailsModel generalDetails;
	private List<ExperienceModel> experiences;
	private List<EducationModel> education;
	private List<ProjectsModel> projects;
	private List<AwardsAndExtraModel> awardsAndExtra;
	private List<AreaOfIntrestModel> areaOfIntrest;
	private List<SkillsModel> skillModel;
	
	public UserModel(String userId) {
		this.userId = userId;
	}

	public GeneralDetailsModel getGeneralDetails() {
		return generalDetails;
	}

	public void setGeneralDetails(GeneralDetailsModel generalDetails) {
		this.generalDetails = generalDetails;
	}

	public List<ExperienceModel> getExperiences() {
		return experiences;
	}

	public void setExperiences(List<ExperienceModel> experiences) {
		this.experiences = experiences;
	}
	
	 void addExperience(ExperienceModel experience) {
		if(this.experiences == null) {
			this.experiences = new ArrayList<>();
		}
		this.experiences.add(experience);
	}

	public List<EducationModel> getEducation() {
		return education;
	}

	public void setEducation(List<EducationModel> education) {
		this.education = education;
	}
	
	void addEducation(EducationModel _education) {
		if(this.education == null) {
			this.education = new ArrayList<>();
		}
		this.education.add(_education);
	}
	
	public List<ProjectsModel> getProjects() {
		return projects;
	}

	public void setProjects(List<ProjectsModel> projects) {
		this.projects = projects;
	}
	
	public List<AwardsAndExtraModel> getAwardsAndExtra() {
		return awardsAndExtra;
	}

	public void setAwardsAndExtra(List<AwardsAndExtraModel> awardsAndExtra) {
		this.awardsAndExtra = awardsAndExtra;
	}

	public void addAwardsAndExtra(AwardsAndExtraModel award) {
		if(this.awardsAndExtra == null) {
			this.awardsAndExtra = new ArrayList<>();
		}
		this.awardsAndExtra.add(award);
	}
	
	public List<AreaOfIntrestModel> getAreaOfIntrest() {
		return areaOfIntrest;
	}


	public void addAreaOfIntrest(AreaOfIntrestModel areaOfIntrests) {
		if(this.areaOfIntrest == null) {
			this.areaOfIntrest = new ArrayList<>();
		}
		this.areaOfIntrest.add(areaOfIntrests);
	}
	public List<SkillsModel> getSkillModel() {
		return skillModel;
	}

	public void setSkillModel(List<SkillsModel> skillModel) {
		this.skillModel = skillModel;
	}

	public String getUserId() {
		return userId;
	}

	public void addProject(ProjectsModel project) {
		if(this.projects == null) {
			this.projects = new ArrayList<>();
		}
		this.projects.add(project);
	}

	public void addSkill(SkillsModel skill) {
		if(this.skillModel == null) {
			this.skillModel = new ArrayList<>();
		}
		this.skillModel.add(skill);
	}

}
