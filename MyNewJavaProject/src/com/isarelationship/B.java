package com.isarelationship;

class B extends A
{
	static int i=100;
	int j=200;
	static
	{
		System.out.println("fron sib of B");
		
	}
	{
		System.out.println("from iib of B");
	}
	B()
	{
		System.out.println("From B()");
	}

}
