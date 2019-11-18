package com.toStrings;

public class MainClass4 {
	public static void main(String[] args) {
		B2 te1=new B2(101,"Adarshnb",18,"selenium");
		B2 te2=new B2(101,"Adarshnb",18,"selenium");
		C2 de1=new C2(102,"Bushan",20,"java");
		C2 de2=new C2(102,"Bushan",20,"java");
		System.out.println(te1.equals(te2));
		System.out.println(de1.equals(de2));
		System.out.println(te1.hashCode());
		System.out.println(te2.hashCode());
		System.out.println(de1.hashCode());
		System.out.println(de2.hashCode());
		
		
	}

}
