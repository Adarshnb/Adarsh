package com.primitivetypecasting;

public class Demo7 {

	public static void main(String[] args) {
		int size=5;
		int[] array=new int[size];
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		for(int i=0,j=1;i<array.length;i++)
		{
			array[i]=j++;
			System.out.println(array[i]);
		}
	}

}
