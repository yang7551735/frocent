package com.frocent.beans.core;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frocent.beans.to.AopDoing;

public class AOPTest {

	@Test
	public void testAspectJ(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-annotation.xml");
		AopDoing aopDoing= (AopDoing)applicationContext.getBean("aopDoing");
		aopDoing.working();
	}
	
}
