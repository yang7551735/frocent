package com.frocent.aspectJ;

import org.junit.Test;

import com.frocent.aspectJ.to.AccountInfo;
import com.frocent.aspectJ.to.Bank;

public class AspectJTest {
	@Test
	public void test(){
		new Bank().deposit(new AccountInfo(), 10);
		new Bank().withdraw(new AccountInfo(), 10);

	}
}
