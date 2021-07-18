package com.springboot.smsalert;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.springboot.alert.AlertSystem;

import lombok.Data;
@Component
@Profile("default")
@ConfigurationProperties("my.app")
@Data
class SmsAlert implements AlertSystem {
	private String service;
	private String fmt;
	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
System.out.println("FROM SMS ALERT"+"  "+service+"  "+fmt);
	}

}
