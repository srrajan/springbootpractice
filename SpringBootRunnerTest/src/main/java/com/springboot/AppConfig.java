package com.springboot;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public CommandLineRunner runC()
	{
		return SampleTest::testOne;
	}
	
	//Lambda Expression
	/*@Bean
	public CommandLineRunner runB()
	{
		
		return (args)->
		{
			System.out.println("Hello from Lambda Expression");
		};
	}
}*/
	/*
	@Bean
public CommandLineRunner runA(){
/new interface(){};Override method
	return new CommandLineRunner() {
		
		@Override
		public void run(String... args) throws Exception {
			// TODO Auto-generated method stub
			System.out.println("Hello form clr");
		}
	};
	
}

}*/
}

