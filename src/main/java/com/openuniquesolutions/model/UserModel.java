package com.openuniquesolutions.model;

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
	private AwardsAndExtraModel awardsAndExtra;
	private AreaOfIntrestModel areaOfIntrest;
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

	public List<EducationModel> getEducation() {
		return education;
	}

	public void setEducation(List<EducationModel> education) {
		this.education = education;
	}

	public List<ProjectsModel> getProjects() {
		return projects;
	}

	public void setProjects(List<ProjectsModel> projects) {
		this.projects = projects;
	}

	public AwardsAndExtraModel getAwardsAndExtra() {
		return awardsAndExtra;
	}

	public void setAwardsAndExtra(AwardsAndExtraModel awardsAndExtra) {
		this.awardsAndExtra = awardsAndExtra;
	}

	public AreaOfIntrestModel getAreaOfIntrest() {
		return areaOfIntrest;
	}

	public void setAreaOfIntrest(AreaOfIntrestModel areaOfIntrest) {
		this.areaOfIntrest = areaOfIntrest;
	}

	public List<SkillsModel> getSkillModel() {
		return skillModel;
	}

	public void setSkillModel(List<SkillsModel> skillModel) {
		this.skillModel = skillModel;
	}

//	public void setSkillModel(SkillsModel skillModel) {
//		this.skillModel.add(skillModel);
//	}
//	
	public String getUserId() {
		return userId;
	}

}
