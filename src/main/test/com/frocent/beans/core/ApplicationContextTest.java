package com.frocent.beans.core;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frocent.beans.to.Settings;
import com.frocent.beans.to.UserAction;
import com.frocent.beans.to.UserActionForAnnotation;
import com.frocent.beans.to.UserActionForAutowire;

public class ApplicationContextTest {

	/**
	 * 测试点：1. ClassPathXmlApplicationContext 2. applicationContext.getBean 3. setter注入ref.value
	 */
	@Test
	public void testClassPathXml(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserAction userAction= (UserAction)applicationContext.getBean("userAction");
		Assert.assertEquals("this is successView", userAction.execute());
	}
	
	/**
	 * 测试 xml 中 bean 标签的name属性
	 */
	@Test
	public void testBeanName(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserAction userAction= (UserAction)applicationContext.getBean("/toqux/user.do");
		Assert.assertEquals("this is successView", userAction.execute());
	}
	
	/**
	 * 
	 */
	@Test
	public void testListSetter(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Settings settings= (Settings)applicationContext.getBean("settings");
		 settings.execute();
	}
	
	@Test
	public void testAutowire(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserActionForAutowire userActionForAutowire= (UserActionForAutowire)applicationContext.getBean("userActionForAutowire");
		userActionForAutowire.execute();
	}
	
	@Test
	public void testAnnotation(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-annotation.xml");
		UserActionForAnnotation userActionForAnnotation= (UserActionForAnnotation)applicationContext.getBean("aopDoing");
		userActionForAnnotation.execute();
	}
	
}
