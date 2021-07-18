package com.springboot.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.model.Student;

public interface StudentRepo extends MongoRepository<Student, String> {

	
	
}
