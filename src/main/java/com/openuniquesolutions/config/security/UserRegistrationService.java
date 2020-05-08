package com.openuniquesolutions.config.security;

import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.openuniquesolutions.exception.UserExists;

@Service
public class UserRegistrationService {
	
	@Autowired
	UserRepo userRepo;

	@Autowired
	PasswordEncoder passwordEncoder;
	
	public Users addNewUser(Users user) throws UserExists {
		Optional<Users> _user = userRepo.findByEmail(user.email);
		if (_user.isPresent()) {
			throw new UserExists("User Email Already Exist");
		}
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return userRepo.save(user);
		
	}

	
	
}
