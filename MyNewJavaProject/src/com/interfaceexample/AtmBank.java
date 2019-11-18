package com.interfaceexample;
import java.util.Scanner;

public class AtmBank {

	public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	ATM atm=new AtmImplimentation(50000);
	for(int i=1;i<=5;i++)
	{
	System.out.println("enter: 1 to deposit amount");
	System.out.println("enter: 2 to check account balance");
	System.out.println("enter: 3 to withdraw the amount");
	int choice=Sc.nextInt();
	switch(choice) {
	
	case 1:System.out.println("enter the amount that you want to deposit");
	long amount1=Sc.nextLong();
	atm.deposit(amount1);
	break;
	
	case 2:System.out.println(atm.checkBalance());
	break;
	
	case 3:System.out.println("enter the amount that you want to withdraw");
	long amount2=Sc.nextLong();
	atm.withdrawal(amount2);
	break;
	
	default:System.out.println("invalid key");
	break;
	
	}
	
	}
	}

}
