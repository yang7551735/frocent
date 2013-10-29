package com.frocent.aspectJ.to;

public class Bank {

	public float deposit(AccountInfo account, float money){ 
		  // 验证 account 是否为合法用户
		// Begin Transaction 
		System.out.println("增加 account 账户的钱数，返回账户里当前的钱数");
		System.out.println(this.getClass());
		// 增加 account 账户的钱数，返回账户里当前的钱数
		// End Transaction 
		return 0;
	}
	
	public float withdraw(AccountInfo account, float money){ 
		  // 验证 account 是否为合法用户
		// Begin Transaction 
		System.out.println("减少 account 账户的钱数，返回取出的钱数");
		System.out.println(this.getClass());
		// 减少 account 账户的钱数，返回取出的钱数
		// End Transaction 
		return 0;
	} 
	
}
