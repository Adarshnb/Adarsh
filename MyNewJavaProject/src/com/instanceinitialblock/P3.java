package com.instanceinitialblock;

class P3 {
	{
		System.out.println("from iib");
		
	}
	P3()
	{
		System.out.println("from P3()");
		
	}
	P3(int i)
	{
		this();
		System.out.println("from P3(int)");
		
	}
	P3(int a ,int b)
	{
		this(100);
		System.out.println("from P3(int,int)");
	}

	public static void main(String[] args) {
		P3 ob1=new P3();
		P3 ob2=new P3(100);
		P3 ob3=new P3(10,150);
	}
	
	
		
		}


