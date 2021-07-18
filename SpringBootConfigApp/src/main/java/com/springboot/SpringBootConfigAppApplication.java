package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootConfigAppApplication {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(SpringBootConfigAppApplication.class, args);
		EmployInfo ef=ac.getBean("emfo",EmployInfo.class);
		System.out.println(ef);
	}

}
