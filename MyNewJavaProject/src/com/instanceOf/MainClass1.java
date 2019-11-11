package com.instanceOf;

class MainClass1 {

	public static void main(String[] args) {
		A ob1=new B();
		System.out.println(ob1 instanceof A);//true
		System.out.println(ob1 instanceof B);//true
		//System.out.println(ob1 instanceof D);ob1 (A) has no is-a relation with D
		B ob2=new B();
		System.out.println(ob2 instanceof A);//true
		System.out.println(ob2 instanceof B);//true
		//System.out.println(ob2 instanceof D);ob2(B) has no is-a realtion with D
		A ob3=new A();
		System.out.println(ob3 instanceof A);//true
		System.out.println(ob3 instanceof B);//false
		

	}

}
