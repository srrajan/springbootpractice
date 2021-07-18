package com.springboot.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
@ConfigurationProperties("app")
public class DataRead implements CommandLineRunner {
//@Value("${app.db}")
private String db;
//@Value("${app.pwd}")
private String pwd;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
System.out.println(this);
	}

}
