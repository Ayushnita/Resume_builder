package com.openuniquesolutions.config.security;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<Users, ObjectId>{
	Optional<Users> findByUserName(String userName);
	Users findByEmail(String email);
}
