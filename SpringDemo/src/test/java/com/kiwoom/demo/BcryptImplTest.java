package com.kiwoom.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.kiwoom.demo.bcrpyt.EncrpytHelper;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BcryptImplTest {
	
	@Autowired
	private EncrpytHelper encryptHelper;
	
	@Test
	void 비밀번호_검증() {
		String password = "JasonPassword1!";
		String encrypted = encryptHelper.encrypt(password);
		assertTrue(encryptHelper.isMatch(password, encrypted));
	}
	
}
