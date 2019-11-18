package com.polymorphism;

public class Main1 {

	public static void main(String[] args) {
		Bank[] b=new Bank[5];
		b[0]=new CanaraBank();
		b[1]=new ICICI();
		b[2]=new SBI();
		b[3]=new SBIInTouch();
		b[4]=new Bank();
		for(Bank bank:b)
		{
			System.out.println(bank.roi());
		}
		
		
		

	}

}
