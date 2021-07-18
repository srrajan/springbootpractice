package com.springboot.model;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class LombokTest implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
StudentDetials s=new StudentDetials();
s.setSid(100);
s.setSname("Raghav");
System.out.println(s);
System.out.println(s.getSid()+"-"+s.getSname());
StudentDetials s1= new StudentDetials();
s1.setSid(100);
s1.setSname("Raghav");
System.out.println(s.equals(s1));
System.out.println(s==s1);

	}

}
