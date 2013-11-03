package com.frocent.beans.core;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frocent.beans.to.UserActionForApplicationContextAware;

public class BeanFactoryAwareTest {

	@Test
	public void testApplicationContextAware(){
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
			UserActionForApplicationContextAware userActionForApplicationContextAware= (UserActionForApplicationContextAware)applicationContext.getBean("userActionForApplicationContextAware");
			Assert.assertEquals("this is successView", userActionForApplicationContextAware.execute());
	}
		
}
