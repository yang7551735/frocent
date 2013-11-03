package com.frocent.beans.to;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class UserActionForAnnotation {
	
	private UserManager userManager;

	public String execute(){
		userManager.add();
		return "";
	}
	
	@Resource
	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
	
}
