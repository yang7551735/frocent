package com.frocent.beans.to;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Interceptor3 implements Ordered{
	
	@Around("execution(* com.frocent.beans.to.AopDoing.*(..))")
	public void before(ProceedingJoinPoint proceedingJoinPoint){
		System.out.println("around....");
		try {
			proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("around....");

	}

	public int getOrder() {
		return 15;
	}
	
}
