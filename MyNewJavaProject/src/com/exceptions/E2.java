package com.exceptions;

public class E2 {
	int i;
	public static void main(String[] args) {
		E2 ob=null;
		System.out.println(1);
		
		System.out.println(2);
		System.out.println(ob.i);//nullPointerException(object of E2 is not created)
		
	}

}
