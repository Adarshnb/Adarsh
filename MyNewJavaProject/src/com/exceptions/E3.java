package com.exceptions;

public class E3 {
	public static void main(String[] args) {
		System.out.println(1);
		int[] a= {12,33,43};
		System.out.println(2);
		System.out.println(a[2]);
		System.out.println(a[5]);//arrayIndexOutOfBoundsException because no value present in a[5] size is a[3]
	}

}
