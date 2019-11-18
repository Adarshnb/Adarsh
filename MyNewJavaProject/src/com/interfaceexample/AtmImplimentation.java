package com.interfaceexample;

public class AtmImplimentation implements ATM {
	long balance;
	public AtmImplimentation(long balance)
	{
		this.balance=balance;
	}
	 public void deposit(long depositAmount)
	{
		if(depositAmount>0)
		{
			balance=balance+depositAmount;
			System.out.println("successfully "+depositAmount+" is deposited");
		}
		else 
			System.out.println("idiot please deposit valid amount");
		
	}
	 public long checkBalance()
	 {
		 System.out.println("your account balance is "+balance);
		 return balance;
	 }
	public void withdrawal(long withdrawalAmount) 
	{
		if(withdrawalAmount<balance)
		{
			balance=balance-withdrawalAmount;
			System.out.println("available balance is "+balance);
		}
		else
		{
			System.out.println("idiot enter amount less than available balance");
		}
		
	}
	 

}
