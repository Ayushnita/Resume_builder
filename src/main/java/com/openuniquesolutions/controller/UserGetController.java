package com.openuniquesolutions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.openuniquesolutions.beans.UsersResultBean;
import com.openuniquesolutions.service.UserDetailService;

@RequestMapping("/api/users")
@RestController
public class UserGetController {
	

	private final UserDetailService userDetailService;
	
	@Autowired
	public UserGetController(UserDetailService userDetailService) {
		this.userDetailService = userDetailService;
	}

	@GetMapping("/check")
	public String checkApi() {
		return "Fine";
	}
	
	@GetMapping
	public UsersResultBean getUserDetails(@AuthenticationPrincipal UserDetails user) {
		return userDetailService.findById (user.getUsername());
	}
	
}
