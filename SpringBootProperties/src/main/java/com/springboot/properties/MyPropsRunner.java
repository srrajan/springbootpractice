package com.springboot.properties;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class MyPropsRunner implements CommandLineRunner {
@Value("${pid}")
	private int  id;
@Value("${pname}")
private String pn;
@Value("${pbudget}")
private int budget;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
System.out.println(this);
	}
	@Override
	public String toString() {
		return "MyPropsRunner [id=" + id + ", pn=" + pn + ", budget=" + budget + "]";
	}
	
}
