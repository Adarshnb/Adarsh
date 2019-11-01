package com.staticmembes;

class Demo6 {
	static int i=20;

	public static void main(String[] args) {
		int i=30;
		System.out.println(i);//30
		System.out.println(Demo6.i);//20
		Demo6.i=40;
		System.out.println(A.i);//10
		m1();
		System.out.println(A.i);//60
		System.out.println(Demo6.i);//50
		System.out.println(i);//30
	}
	public static void m1()
	{
		System.out.println(i);//40
		i=50;
		A.i=60;

	}

}
