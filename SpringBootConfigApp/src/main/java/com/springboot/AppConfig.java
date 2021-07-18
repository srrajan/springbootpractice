package com.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public EmployInfo emfo()
	{
	EmployInfo in=new EmployInfo();
	in.setCode(12);
	in.setName("Ram");
	return in;
}

}
