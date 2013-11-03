package com.frocent.aspectJ.to;

public aspect TransactionAspect {
	  pointcut bankMethods() : execution(* com.frocent.aspectJ.to.Bank.deposit(..)) ||execution (* com.frocent.aspectJ.to.Bank.withdraw (..)); 
	  Object around(): bankMethods(){ 
	  System.out.println("Begin Transaction "); 
	  Object result = proceed(); 
	  System.out.println("End Transaction"); 
	  return result; 
	  } 
}
