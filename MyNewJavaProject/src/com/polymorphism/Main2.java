package com.polymorphism;

public class Main2 {
	static void display(Bank bank)
	{
		System.out.println(bank.roi());
	}

	public static void main(String[] args) {
		Bank bank;
		bank=new ICICI();
		display(bank);
	    bank=new CanaraBank();
	    display(bank);
	    bank=new SBI();
	    display(bank);
	    bank=new Bank();
	    display(bank);
	    bank=new SBIInTouch();
	    display(bank);

		

	}

}
