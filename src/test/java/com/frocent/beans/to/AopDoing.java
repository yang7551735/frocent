package com.frocent.beans.to;

import org.springframework.stereotype.Component;

@Component
public class AopDoing {

	public void working(){
		System.out.println("donging...");
	}
	
	public void throwing(){
			throw new RuntimeException();
	}
	
	
}
