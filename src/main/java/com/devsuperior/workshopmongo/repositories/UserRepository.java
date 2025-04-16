package com.devsuperior.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.devsuperior.workshopmongo.entities.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface UserRepository extends ReactiveMongoRepository<User, String> {

}
