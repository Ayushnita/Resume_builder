package com.openuniquesolutions.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.openuniquesolutions.model.UserModel;

@Repository
public interface UserDetailsDao extends MongoRepository<UserModel, String> {
	UserModel findByUserId(String userId);
}
