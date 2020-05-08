package com.openuniquesolutions.repo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.openuniquesolutions.model.UserModel;

@Repository
public interface UserDetailsDao extends MongoRepository<UserModel, String> {
	Optional<UserModel> findByUserId(String userId);
}
