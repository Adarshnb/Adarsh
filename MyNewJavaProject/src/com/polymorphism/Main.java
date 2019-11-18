package com.polymorphism;

public class Main {

	public static void main(String[] args) {
		Bank bank;
		bank=new ICICI();
		System.out.println(bank.roi());
	    bank=new CanaraBank();
	    double rate=bank.roi();
	    System.out.println(rate);
	    bank=new SBI();
	    System.out.println(bank.roi());
	    bank=new Bank();
	    System.out.println(bank.roi());
	    bank=new SBIInTouch();
	    System.out.println(bank.roi());

	}

}
