package com.frocent.beans.to;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Interceptor2 implements Ordered{
	
	@Before("execution(* com.frocent.beans.to.AopDoing.*(..))")
	public void before(){
		System.out.println("before2....");
	}
	
	@After("execution(* com.frocent.beans.to.AopDoing.*(..))")
	public void after(){
		System.out.println("after2...");
	}

	public int getOrder() {
		return 10;
	}
	
}
