package com.toStrings;

public class A2 {
	int id;
	String name;
	double salary;
	A2(){}
	A2(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public boolean equals(Object ob)
	{
		A2 temp=(A2)ob;
		return this.id==temp.id&&this.salary==temp.salary&&this.name.equals(temp.name);
	}
	public int hashCode()
	{
		return id+(int)salary+name.hashCode();
	}

}
