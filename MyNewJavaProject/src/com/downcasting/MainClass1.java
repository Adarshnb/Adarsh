package com.downcasting;

public class MainClass1 {
static void display(A obj)
{
	System.out.println(obj.i);
	if(obj instanceof B)
	{
		B obj1=(B) obj;
		System.out.println(obj1.j);
	}
	if(obj instanceof C)
	{
		System.out.println(((C)obj).k);
	}
}
public static void main(String[] args) {
		A ob1=new A(10);
		B ob2=new B(100,200);
		C ob3=new C(1000,2000,3000);
		display(ob1);
		display(ob2);
		display(ob3);
		

	}

}
