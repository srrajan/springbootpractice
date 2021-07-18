package com.springboot.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
@ConfigurationProperties(prefix="my.app")

public class ProfileDataRead implements CommandLineRunner {
private String name;
private String version;
private String driver;
private String url;
private String email;
private String domain;
private String host;
private String server;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
System.out.println(this);
	}

}
