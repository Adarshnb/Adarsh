package com.primitivetypecasting;
import java.util.Scanner;

public class revArray {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the size of array req");
		int s=Sc.nextInt();
		int[] a=new int[s];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter array element");
			a[i]=Sc.nextInt();
		}
		int[] b=new int[s];
		for(int i=a.length-1,j=0;j<b.length;j++,i--)
		{
			b[j]=a[i];
		}
		for(int j=0;j<b.length;j++)
		{
			System.out.println(b[j]);
		}
		

	}

}
