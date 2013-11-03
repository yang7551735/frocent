package com.frocent.aspectJ.to;

public aspect AuthAspect {

	pointcut bankMethods() : execution (* com.frocent.aspectJ.to.Bank.deposit(..)) || execution (* com.frocent.aspectJ.to.Bank.withdraw(..));

	Object around(): bankMethods(){
		  System.out.println("account 是否为合法用户"); 
		return proceed();
	}

}
