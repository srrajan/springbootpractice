package com.springboot.model;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties(prefix = "my.app")
public class MyDataRunner implements CommandLineRunner {
private DBCon con;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
System.out.println(con);
	}
	public DBCon getCon() {
		return con;
	}
	public void setCon(DBCon con) {
		this.con = con;
	}

}
