package com.springboot.argument;



import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class CoomandLineArgument implements CommandLineRunner {
@Value("${title}")
	private String title;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("DONE");
System.out.println(title);
	}

}
