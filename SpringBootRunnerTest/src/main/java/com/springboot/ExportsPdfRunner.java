package com.springboot;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
@Component
public class ExportsPdfRunner implements ApplicationRunner{
	@Value("${spring.application.name}")
	private String name;
	@Override
	public void run(ApplicationArguments  args) throws Exception
	{
		
		//print like array
		System.out.println(Arrays.asList(args.getSourceArgs()));
		//print non option args
		System.out.println("Non-opt"+args.getNonOptionArgs());
		//print option args based on key input
		System.out.println("one option by key:"+args.getOptionValues("port"));
		//print given kety exist or not
		System.out.println("Option key exist or not:"+args.containsOption("ioc"));
		//get all key from option args
		System.out.println("All key:"+args.getOptionNames());
		if(args.getNonOptionArgs().contains("start")) {
			System.out.println("Start taaking database");
		}
		System.out.println(name);
		
	}

}
