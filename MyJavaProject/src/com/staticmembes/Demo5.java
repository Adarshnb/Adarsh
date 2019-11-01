package com.staticmembes;

class Demo5 {
	static int i;

	public static void main(String[] args) {
		int i=20;
		System.out.println(i);
		System.out.println(Demo5.i);
		m1();
		System.out.println(Demo5.i);

	}
	public static void m1()
	{
		System.out.println(i);
		i=10;
	}

}
