package com.kiwoom.demo.annotation;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MyObject {
	
	@StringInjector("My name is HyunWoo")
	private String name;
	
	@StringInjector
	private String defaultValue;
	
	@StringInjector
	private Integer invalidType;
		
}
