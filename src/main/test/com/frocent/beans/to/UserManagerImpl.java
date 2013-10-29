package com.frocent.beans.to;

import org.springframework.stereotype.Component;

@Component("userManager")
public class UserManagerImpl implements UserManager{
	
	public void add(){
		System.out.println("add new user");
	}

}
