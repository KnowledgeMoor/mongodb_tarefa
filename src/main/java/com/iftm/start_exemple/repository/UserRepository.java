package com.iftm.start_exemple.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iftm.start_exemple.models.User;

@Repository
public interface UserRepository extends MongoRepository<User,ObjectId>{
}
