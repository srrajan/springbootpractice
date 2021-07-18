package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource("file:./mno.properties")
//@PropertySource("file:D:/data/abc.properties")
public class SpringBootPropsExOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPropsExOneApplication.class, args);
	}

}
