package com.kiwoom.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kiwoom.demo.bcrpyt.BCryptImpl;
import com.kiwoom.demo.bcrpyt.EncrpytHelper;

@Configuration
public class AppConfig {
	
	@Bean
	public EncrpytHelper encrpytHelper() {
		return new BCryptImpl();
	}
}
