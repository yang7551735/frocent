package com.frocent.beans.to;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Interceptor implements Ordered{
	
	@Before("execution(* com.frocent.beans.to.AopDoing.*(..))")
	public void before(){
		System.out.println("before....");
	}
	
	@After("execution(* com.frocent.beans.to.AopDoing.*(..))")
	public void after(){
		System.out.println("after...");
	}

	public int getOrder() {
		return 30;
	}
	
}
