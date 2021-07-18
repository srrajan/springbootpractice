package com.springrest.springrest.entities;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor

public class Course {

	@Id
	private Long id;
	private String cname;
	private double cfee;
	
	
}
