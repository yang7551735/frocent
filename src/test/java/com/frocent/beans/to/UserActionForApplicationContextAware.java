package com.frocent.beans.to;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class UserActionForApplicationContextAware implements ApplicationContextAware{
	
	private ApplicationContext applicationContext;
	
	private String successView;
	
	public String execute(){
		UserManager userManager = (UserManager)applicationContext.getBean("userManager");
		userManager.add();
		return successView;
	}

	public void setSuccessView(String successView) {
		this.successView = successView;
	}

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;
	}
}
