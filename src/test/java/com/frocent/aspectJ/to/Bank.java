package com.frocent.aspectJ.to;

public class Bank {

	public float deposit(AccountInfo account, float money){ 
		  // ��֤ account �Ƿ�Ϊ�Ϸ��û�
		// Begin Transaction 
		System.out.println("���� account �˻���Ǯ���������˻��ﵱǰ��Ǯ��");
		System.out.println(this.getClass());
		// ���� account �˻���Ǯ���������˻��ﵱǰ��Ǯ��
		// End Transaction 
		return 0;
	}
	
	public float withdraw(AccountInfo account, float money){ 
		  // ��֤ account �Ƿ�Ϊ�Ϸ��û�
		// Begin Transaction 
		System.out.println("���� account �˻���Ǯ��������ȡ����Ǯ��");
		System.out.println(this.getClass());
		// ���� account �˻���Ǯ��������ȡ����Ǯ��
		// End Transaction 
		return 0;
	} 
	
}
