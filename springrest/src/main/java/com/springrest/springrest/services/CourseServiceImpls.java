package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.repository.MongoRepo;
@Service
public class CourseServiceImpls implements CourseService {

	@Autowired
	private MongoRepo repo;
	
	@Override
	public List<Course> getCourses() {
		
		return repo.findAll();
	}

}
