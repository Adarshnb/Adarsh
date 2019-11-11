package com.miscellaneous;

class MainClass {
	static void display(A ob)
	{
		System.out.println(ob.i);
		System.out.println(ob.j);
		System.out.println(ob.hi);
		System.out.println("*********");
	}

	public static void main(String[] args) {
		A ob1=new A(10,10.22,"adarsh");
		A ob2= new A(100,10.55,"rajesh");
		A ob3=new A(150,5.2,"bharath");
		display(ob1);
		display(ob2);
		display(ob3);
		

	}

}
