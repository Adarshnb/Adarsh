package com.nonstaticmembers;

class MainClass {

	public static void main(String[] args) {
		A ob1=new A();
		B ob2=new B();
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob1.d);
		System.out.println(ob2.d);
		ob1.d=12.0;
		System.out.println(ob1.d);
		System.out.println(ob2.d);
		ob1.d=30;
		ob2.d=40;
		System.out.println(ob1.d);
		System.out.println(ob2.d);
		
		
	}

}
