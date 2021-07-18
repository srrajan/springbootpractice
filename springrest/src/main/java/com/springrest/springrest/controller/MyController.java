package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;
import com.springrest.springrest.services.CourseServiceImpls;

@RestController
public class MyController {
	@Autowired
	private CourseService courseservice;
	@GetMapping("/home")
public String home() {
	return "Welcome To Courses Aplication";
}
	
	//get the courses
	@GetMapping("/courses")
	public List<Course> getCourses(){
		
		return this.courseservice.getCourses();
	}
}
