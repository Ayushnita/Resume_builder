package com.openuniquesolutions.service;

import java.util.List;

import com.openuniquesolutions.model.EducationModel;
import com.openuniquesolutions.model.ExperienceModel;
import com.openuniquesolutions.model.GeneralDetailsModel;
import com.openuniquesolutions.model.ProjectsModel;
import com.openuniquesolutions.model.SkillsModel;
import com.openuniquesolutions.model.UserModel;

public interface UserDetailService {

	String createUserWithGenerealDetails(String email, GeneralDetailsModel generealDetails);
	
	UserModel findById(String id);

	String saveSkillForUserId(String userId, List<SkillsModel> skillList);

	String saveAreaOfIntrests(String userId, List<String> intrests);

	String addExtrasAndAwards(String id, List<String> extrasAndAwards);

	String addEducationDetails(String id, List<EducationModel> educationList);

	String addExperienceDetailsService(String id, List<ExperienceModel> educationModel);

	String addProjectsDetails(String id, List<ProjectsModel> projects);

}