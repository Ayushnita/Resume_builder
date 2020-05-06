package com.openuniquesolutions.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.openuniquesolutions.exception.UserExists;

@RestController()
@RequestMapping("/api")
public class UserRegistrationController {

	@Autowired
	UserRegistrationService userRegistrationService;
	
	@PostMapping("/signup")
	public Users registerterNewUser(@RequestBody Users user) {
		System.out.println("try to fix signUp");
		try {
			return userRegistrationService.addNewUser(user);
		} catch (UserExists e) {
			return new Users();
		}
	}
	
	@GetMapping("/check")
	public String checkSignUpController() {
		return "Sign Up controller";
	}
}
