package com.openuniquesolutions.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openuniquesolutions.beans.UsersResultBean;
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

	private final UserDetailsDao userDetailsDao;
	
	@Autowired
	public UserDetailServiceImpl(UserDetailsDao userDetailsDao) {
		this.userDetailsDao = userDetailsDao;
	}
	
	private UserModel getUserOrNewUser(String userId) {
		
		return userDetailsDao.findById(userId)
					.map(user -> user)
					.orElse(new UserModel(userId));
	}
	
	@Override
	public String createUserWithGenerealDetails(String email, GeneralDetailsModel generealDetails){
		UserModel user = getUserOrNewUser(email);
		user.setGeneralDetails(generealDetails);
		UserModel u = userDetailsDao.save(user);
		return u.getUserId();
	}

	@Override
	public UsersResultBean findById(String id) {
		UserModel user = getUserOrNewUser(id);
		List<UserModel> userList = new ArrayList<UserModel>();
		userList.add(user);
		return new UsersResultBean(1, userList);
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
