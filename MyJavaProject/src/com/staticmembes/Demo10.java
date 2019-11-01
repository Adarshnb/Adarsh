package com.staticmembes;

class Demo10 {
static int i;
static
{
	System.out.println("from sib-1");
	System.out.println(i);
	i=20;
}
	public static void main(String[] args) {
		System.out.println("from main");
		System.out.println(i);
		

	}

}
