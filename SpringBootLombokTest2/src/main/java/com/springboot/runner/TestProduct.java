package com.springboot.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class TestProduct implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Product p=new Product(101,"GulabZamun");
		System.out.println(p);
	}

}
