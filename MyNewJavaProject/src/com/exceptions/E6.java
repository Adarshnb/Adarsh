package com.exceptions;

public class E6 {
	public static void main(String[] args) {
		System.out.println("main started");
		int[] a= {10,20,30};
		System.out.println(a[0]);
		System.out.println(a[2]);
		try {
			System.out.println(a[3]);
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("main ends");
	}

}
