package com.staticmembes;

class A {
	static int i=10;

	public static void main(String[] args) {
		System.out.println(A.i);
		i=600;
		System.out.println(A.i);
	

	}

}
