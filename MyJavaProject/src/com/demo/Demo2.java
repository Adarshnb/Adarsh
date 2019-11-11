package com.demo;

class Demo2 {
	int i;
	void test()
	{
		System.out.println(i);
		i=20;
		System.out.println(this.i);
	}

	public static void main(String[] args) {
		Demo2 a=new Demo2();
		System.out.println(a.i);//0
		a.test();
		System.out.println(a.i);//20
		Demo2 b=new Demo2();
		System.out.println(b.i);
		
		

	}

}
