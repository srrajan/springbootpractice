package com.springboot.runner;

import java.security.KeyStore.PrivateKeyEntry;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.springboot.model.Vendor;


import lombok.Data;
@Component
@Data
@ConfigurationProperties(prefix="my.app")
public class MyProductRunner implements CommandLineRunner {
private Integer pid;
private String pname;
//private Double pprice;

private String[] details;
//private Map<String, Integer> versions;
private Properties versions;
private Vendor  vob;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
System.out.println(this);
	}

}
