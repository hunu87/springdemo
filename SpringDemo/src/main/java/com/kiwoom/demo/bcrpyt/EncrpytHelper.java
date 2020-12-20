package com.kiwoom.demo.bcrpyt;

public interface EncrpytHelper {
	String encrypt(String password);
	
	boolean isMatch(String password, String hashed);
}
