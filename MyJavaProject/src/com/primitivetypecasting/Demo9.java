package com.primitivetypecasting;
import java.util.Scanner;

class Demo9 {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the starting number");
		int n=Sc.nextInt();
		System.out.println("enter the no. of even no tht you want to store in array");
		int size=Sc.nextInt();
		int[] a=new int[size];
		for(int i=0;i<a.length;n++)
		{
			if(n%2==0)
				a[i++]=n;
		}
		System.out.println("array is:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
			
		
			
		
	}

}
