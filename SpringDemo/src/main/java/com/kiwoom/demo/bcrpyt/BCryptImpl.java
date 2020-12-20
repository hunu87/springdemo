package com.kiwoom.demo.bcrpyt;

import org.mindrot.jbcrypt.BCrypt;

public class BCryptImpl implements EncrpytHelper{
	
	@Override
	public String encrypt(String password) {
		return BCrypt.hashpw(password, BCrypt.gensalt());
	}
	
	@Override
	public boolean isMatch(String password, String hashed) {
		return BCrypt.checkpw(password, hashed);
	}
}
