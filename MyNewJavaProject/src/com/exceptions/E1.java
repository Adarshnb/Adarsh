package com.exceptions;

public class E1 {
private void psvm() {
	System.out.println("main started");
	int a =10;
	System.out.println(1);
	int b=0;
	System.out.println(2);
	int c=a/b;//arithmeticException(because b=0)
	System.out.println("main ended");

}
}
