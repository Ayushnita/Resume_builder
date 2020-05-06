package com.openuniquesolutions.config.security;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<Users, ObjectId>{
	Users findByUserName(String userName);

	Users findByEmail(String email);
}
