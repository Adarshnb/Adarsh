package com.toStrings;

public class Developer extends Employee {
	String lang;
	Developer(){}
	Developer(int id,String name,double salary,String lang)
	{
		super(id,name,salary);
		this.lang=lang;
		
	}
	public String toString(Object ob)
	{
		return super.toString()+" "+lang;
	}
	

}
