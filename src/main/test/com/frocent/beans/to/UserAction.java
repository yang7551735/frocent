package com.frocent.beans.to;

public class UserAction {
	
	private UserManager userManager;
	
	private String successView;
	
	public String execute(){
		userManager.add();
		return successView;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	public void setSuccessView(String successView) {
		this.successView = successView;
	}
}
