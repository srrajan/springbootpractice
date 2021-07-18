package com.springboot.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class MrssageRunner implements CommandLineRunner {
	@Value("${code}")
			
private String code;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
System.out.println("DONE"+"   "+code);
	}

}
