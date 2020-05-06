package com.openuniquesolutions.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class UserBuilderDetailService implements UserDetailsService {

	@Autowired
	UserRepo userRepo;
	
	@Override
	public Users loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("Calling user Detail Service in Spring Security");
		Users user = userRepo.findByUserName(username);
		if(user == null) {
			throw new UsernameNotFoundException("User Not Found");
		}
		
		return new Users(user.getEmail(), user.getUsername(), user.getPassword());
}
}
