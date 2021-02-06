package com.kiwoom.demo;

import static org.junit.Assert.*;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.kiwoom.demo.annotation.MyContextContainer;
import com.kiwoom.demo.annotation.MyObject;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AnnotationTest {

	@Test
	public void testAnnotation() throws IllegalAccessException, InstantiationException{
		
		MyContextContainer myContextContainer = new MyContextContainer();
		MyObject myObject = myContextContainer.get(MyObject.class);
		
		// System.out.println("name : " + myObject.getName());
		// System.out.println("defaultValue : " + myObject.getDefaultValue());
		// System.out.println("invalidType : " + myObject.getInvalidType());
		
		Assertions.assertThat(myObject.getName().toLowerCase().contains("hyunwoo")).isTrue();
		Assertions.assertThat(myObject.getDefaultValue().toLowerCase().contains("stringinjector")).isTrue();
		Assertions.assertThat(myObject.getInvalidType()).isNull();
	}

}
