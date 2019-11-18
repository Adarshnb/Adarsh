package com.polymorphism;

public class MainClass1 {

	public static void main(String[] args) {
	A ob;
	ob = new A();
	ob.test();
	ob=new B();
	ob.test();//output will be test() of B since opt depends on object created

	}

}
