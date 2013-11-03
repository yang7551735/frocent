package com.frocent.beans.to;

import java.util.List;
import java.util.Map;
import java.util.Set;


public class Settings {
	
	private List<UserManager> userManagerList;
	private Map<String,UserManager> userManagerMap;
	private Set<UserManager> userManagerSet;
	
	public String execute(){
		System.out.println(userManagerList);
		System.out.println(userManagerMap);
		System.out.println(userManagerSet);
		return "";
	}
	
	public void setUserManagerList(List<UserManager> userManagerList) {
		this.userManagerList = userManagerList;
	}
	public void setUserManagerMap(Map<String, UserManager> userManagerMap) {
		this.userManagerMap = userManagerMap;
	}
	public void setUserManagerSet(Set<UserManager> userManagerSet) {
		this.userManagerSet = userManagerSet;
	}
	
}
