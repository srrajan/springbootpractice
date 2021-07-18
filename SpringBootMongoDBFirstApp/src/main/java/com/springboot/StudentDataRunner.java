package com.springboot;

import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.model.Student;
import com.springboot.repo.StudentRepo;

import ch.qos.logback.core.net.SyslogOutputStream;
@Component
public class StudentDataRunner implements CommandLineRunner {
@Autowired
	private StudentRepo repo;
	
	

	public void run(String... args) throws Exception {
	repo.save(new Student(106,"Dheeraj",2.0));
	repo.save(new Student(107,"NanaPatekar",4.1));
	repo.save(new Student(108,"Surya",7.2));
	repo.save(new Student(109,"Teja",85.5));
	repo.save(new Student(110,"Gopal",3.3));
	
		
		
		/* Delete method*/
		//repo.deleteAll();
		
		//print all data
	repo.findAll().forEach(System.out::println);
	
	//count the data
//System.out.println(repo.count());
	
	//checking data is avialiable or not

		
	}

}
