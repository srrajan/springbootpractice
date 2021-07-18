package com.springboot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Document//suprt geneation of collections
public class Student {
@Id//primary key
	private String id;
@NonNull
	private Integer sid;
@NonNull
	private String sname;
@NonNull
	private Double sfee;
	
	
	
	
}
