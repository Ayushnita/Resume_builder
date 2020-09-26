package com.openuniquesolutions.model;

public class UserModelBuilder {

	private final UserModel user;

	public UserModelBuilder(String Id) {
		this.user = new UserModel(Id);
	}
	
	
	public UserModelBuilder addGeneralDetails(GeneralDetailsModel generalDetailsModel) {
		this.user.setGeneralDetails(generalDetailsModel);
		return this;
	}
	
	public UserModelBuilder addExperience(ExperienceModel experienceModel) {
		this.user.addExperience(experienceModel);
		return this;
	}
	
	public UserModelBuilder addEducation(EducationModel education) {
		this.user.addEducation(education);
		return this;
	}
	
	public UserModelBuilder addProject(ProjectsModel project) {
		this.user.addProject(project);
		return this;
	}
	
	public UserModelBuilder addAwardsAndExtras(AwardsAndExtraModel awards) {
		this.user.addAwardsAndExtra(awards);
		return this;
	}
	
	public UserModelBuilder addAreaOfIntrest(AreaOfIntrestModel intrests) {
		this.user.addAreaOfIntrest(intrests);
		return this;
	}
	
	public UserModelBuilder addSkill(SkillsModel skill) {
		this.user.addSkill(skill);
		return this;
	}
	
	public UserModel build() {
		return this.user;
	}
}












