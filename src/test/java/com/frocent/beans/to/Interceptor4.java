package com.frocent.beans.to;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Interceptor4 implements Ordered{
	
	@AfterThrowing("execution(* com.frocent.beans.to.AopDoing.*(..))")
	public void before(){
		System.out.println("AfterThrowing....");
	}

	public int getOrder() {
		return 15;
	}
	
}
