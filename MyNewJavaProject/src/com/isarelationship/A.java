package com.isarelationship;

class A {
	static int x=10;
	int y=20;
	static
	{
		System.out.println("from sib if A");
	}
	{
		System.out.println("from iib of A");
		
	}
	A()
	{
		System.out.println("from A()");
	}

}
