package com.openuniquesolutions.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openuniquesolutions.model.AreaOfIntrestModel;
import com.openuniquesolutions.model.AwardsAndExtraModel;
import com.openuniquesolutions.model.EducationModel;
import com.openuniquesolutions.model.ExperienceModel;
import com.openuniquesolutions.model.GeneralDetailsModel;
import com.openuniquesolutions.model.ProjectsModel;
import com.openuniquesolutions.model.SkillsModel;
import com.openuniquesolutions.model.UserModel;
import com.openuniquesolutions.repo.UserDetailsDao;

@Service
public class UserDetailServiceImpl implements UserDetailService {

	@Autowired
	UserDetailsDao userDetailsDao;
	
	private UserModel getUserOrNewUser(String userId) {
		Optional<UserModel> userOptional = userDetailsDao.findById(userId);
		UserModel user = null;
		if (!userOptional.isPresent()) {
			user = new UserModel(userId);
		}else {
			 user = userOptional.get();
		}
		return user;
	}
	
	@Override
	public String createUserWithGenerealDetails(String email, GeneralDetailsModel generealDetails){
		UserModel user = getUserOrNewUser(email);
		user.setGeneralDetails(generealDetails);
		UserModel u = userDetailsDao.save(user);
		return u.getUserId();
	}

	@Override
	public UserModel findById(String id) {
		UserModel user = getUserOrNewUser(id);
		return user;
	}

	@Override
	public String saveSkillForUserId(String userId, List<SkillsModel> skillList) {
		UserModel user = getUserOrNewUser(userId);
		user.setSkillModel(skillList);
		UserModel u =userDetailsDao.save(user);
		return u.getUserId();
	}

	@Override
	public String saveAreaOfIntrests(String userId, List<String> intrests) {
		UserModel user = getUserOrNewUser(userId);
		AreaOfIntrestModel areaOfIntrest = new AreaOfIntrestModel();
		areaOfIntrest.setAreaOfIntrests(intrests);
		user.setAreaOfIntrest(areaOfIntrest);
		userDetailsDao.save(user);
		return user.getUserId();
	}

	@Override
	public String addExtrasAndAwards(String id, List<String> extrasAndAwards) {
		UserModel user = getUserOrNewUser(id);
		AwardsAndExtraModel awardsAndExtraModel = new AwardsAndExtraModel();
		awardsAndExtraModel.setExtrasAndAwards(extrasAndAwards);
		user.setAwardsAndExtra(awardsAndExtraModel);
		userDetailsDao.save(user);
		return user.getUserId();
	}

	@Override
	public String addEducationDetails(String id, List<EducationModel> educationList) {
		UserModel user = getUserOrNewUser(id);
		user.setEducation(educationList);
		userDetailsDao.save(user);
		return user.getUserId();
	}

	@Override
	public String addExperienceDetailsService(String id, List<ExperienceModel> experienceModel) {
		UserModel user  = getUserOrNewUser(id);
		user.setExperiences(experienceModel);
		userDetailsDao.save(user);
		return user.getUserId();
	}

	@Override
	public String addProjectsDetails(String id, List<ProjectsModel> projects) {
		UserModel user = getUserOrNewUser(id);
		user.setProjects(projects);
		userDetailsDao.save(user);
		return user.getUserId();
	}
	
		
}
