package com.primitivetypecasting;
import java.util.Scanner;

public class isPrimeArray {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("please enter starting  no.");
		int n=Sc.nextInt();
		System.out.println("please enter no. of prime nos to be stored");
		int s=Sc.nextInt();
		int[] a=new int[s];
		for(int i=0;i<a.length;n++)
		{
			if(isPrime(n))
				a[i++]=n;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
		public static boolean isPrime(int n) {
		int count=2;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				count=count+1;
		}
		if(count==2)
			return true;
		else
			return false;
		}
		

		
		
		

	}


