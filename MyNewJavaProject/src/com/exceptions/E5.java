package com.exceptions;

public class E5 {

	public static void main(String[] args) {
	System.out.println("main started");
	A ob=null;
	try
	{
		ob.i=10;
	}
	catch(NullPointerException e)
	{
		System.out.println(e);
	}
	System.out.println("main ended");

	}

}
