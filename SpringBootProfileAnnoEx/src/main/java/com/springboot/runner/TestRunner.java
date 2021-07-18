package com.springboot.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.springboot.alert.AlertSystem;
@Component
public class TestRunner implements CommandLineRunner {
	@Autowired

private AlertSystem als;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
als.sendMessage();
	}

}
