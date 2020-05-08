package com.openuniquesolutions.config.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.openuniquesolutions.exception.UserExists;

@Service
public class UserRegistrationService {
	
	private final UserRepo userRepo;
	private final PasswordEncoder passwordEncoder;
	
	@Autowired
	public UserRegistrationService(UserRepo userRepo, PasswordEncoder passwordEncoder) {
		this.userRepo = userRepo;
		this.passwordEncoder = passwordEncoder;
	}



	public Users addNewUser(Users user) throws UserExists {
		Optional<Users> _user = userRepo.findByEmail(user.email);
		if (_user.isPresent()) {
			throw new UserExists("User Email Already Exist");
		}
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return userRepo.save(user);	
	}

}
