package com.frocent.beans.to;

public class UserActionForAutowire {
	
	private UserManager userManager;

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
	
	public String execute(){
		
		userManager.add();
		
		return "";
	}

}
