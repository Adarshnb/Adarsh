package com.toStrings;

public class B1 extends A1 {
	char ch;
	String s;
	B1(){}
	B1(int i,double j,char ch,String s){
		super(i,j);
		this.ch=ch;
		this.s=s;
	}
	public String toString() {
		return super.toString()+" "+ch+" "+s;
	}
	

}
