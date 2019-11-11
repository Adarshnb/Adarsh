package com.upcasting;

class MainClass1 {

	public static void main(String[] args) {
		A ob1=new B();
		System.out.println(ob1.i);
		//System.out.println(ob1.j);Using parent type ref.variable we can't acces the members of child class
		B ob2=new B();
		System.out.println(ob2.i);
		System.out.println(ob2.j);
		A ob3=ob2;
		System.out.println(ob3.i);
		//System.out.println(ob3.j);Using parent type ref. var we can't access the members of child class
		
	}

}
