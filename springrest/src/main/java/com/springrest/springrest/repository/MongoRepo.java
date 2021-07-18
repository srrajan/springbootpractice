package com.springrest.springrest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springrest.springrest.entities.Course;

public interface MongoRepo extends MongoRepository<Course, Long>{

}
