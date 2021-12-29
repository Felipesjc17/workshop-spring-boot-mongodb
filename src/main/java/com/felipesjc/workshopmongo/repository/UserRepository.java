package com.felipesjc.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.felipesjc.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
