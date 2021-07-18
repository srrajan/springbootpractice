package com.springboot.emailalert;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.springboot.alert.AlertSystem;

import lombok.Data;
@Component
@Profile("email")
@Data
@ConfigurationProperties("my.app")
public class EmailAlertSms implements AlertSystem {
private String service;
private String fmt;
	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
System.out.println("FROM EMAIL ALERT"+" "+service+" "+fmt);
	}

}
