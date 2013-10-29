package com.frocent.aspectJ.to;

public aspect AuthAspect {

	pointcut bankMethods() : execution (* com.frocent.aspectJ.to.Bank.deposit(..)) || execution (* com.frocent.aspectJ.to.Bank.withdraw(..));

	Object around(): bankMethods(){
		  System.out.println("account �Ƿ�Ϊ�Ϸ��û�"); 
		return proceed();
	}

}
