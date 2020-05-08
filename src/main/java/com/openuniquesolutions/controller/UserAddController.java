package com.openuniquesolutions.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Feature;
import com.openuniquesolutions.model.EducationModel;
import com.openuniquesolutions.model.ExperienceModel;
import com.openuniquesolutions.model.GeneralDetailsModel;
import com.openuniquesolutions.model.ProjectsModel;
import com.openuniquesolutions.model.SkillsModel;
import com.openuniquesolutions.service.UserDetailService;

@RestController
@RequestMapping("/api/add")
public class UserAddController {
	
	
	private final UserDetailService userDetailService;
	
	@Autowired
	public UserAddController(UserDetailService userDetailService) {
		this.userDetailService = userDetailService;
	}

	@PostMapping("/general")
	public String addUserDetails(@AuthenticationPrincipal UserDetails user,@ModelAttribute GeneralDetailsModel general){
		return userDetailService.createUserWithGenerealDetails(user.getUsername(), general);
	}
	
	@PostMapping("/skills")
	@JsonFormat(with =Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)
	public String addSkillsDetails(@AuthenticationPrincipal UserDetails user, @RequestBody List<SkillsModel> skillsList) {
		return userDetailService.saveSkillForUserId(user.getUsername(), skillsList);
	}
	
	@PostMapping("/areaofintrest")
	@JsonFormat(with = Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)
	public String addAreaOfIntrests(@AuthenticationPrincipal UserDetails user, @RequestBody List<String> intrests) {
		return userDetailService.saveAreaOfIntrests(user.getUsername(), intrests);
	}

	@PostMapping("/awardsandextras")
	@JsonFormat(with = Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)
	public String addExtrasAndAwards(@AuthenticationPrincipal UserDetails user, @RequestBody List<String> extrasAndAwards) {
		return userDetailService.addExtrasAndAwards(user.getUsername(), extrasAndAwards);
	}
	
	@PostMapping("/education")
	public String addEducationDetais(@AuthenticationPrincipal UserDetails user, @RequestBody List<EducationModel> educationList) {
		return userDetailService.addEducationDetails(user.getUsername(), educationList);
	}
	
	@PostMapping("/experience")
	public String addExperienceDetails(@AuthenticationPrincipal UserDetails user, @RequestBody List<ExperienceModel> educationModel) {
		return userDetailService.addExperienceDetailsService(user.getUsername(), educationModel);
	}
	
	@PostMapping("/projects")
	public String addProjectsDetails(@AuthenticationPrincipal UserDetails user, @RequestBody List<ProjectsModel> projects) {
		return userDetailService.addProjectsDetails(user.getUsername(), projects);
	}
	
	@GetMapping("/check")
	public String getServerStatus() {
		return "Server is up and running";
	}
}
