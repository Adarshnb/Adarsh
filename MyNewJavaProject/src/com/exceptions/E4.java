package com.exceptions;

public class E4 {
	public static void main(String[] args) {
		System.out.println("main started");
		A ob1=new A();
		try
		{
			B ob2=(B)ob1;
			System.out.println(ob2);
		}
		catch(ClassCastException e)
		{
			System.out.println("caught"+e);
		}
	}

}
