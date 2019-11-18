package com.toStrings;

public class B2 extends A2{
	String tool;
	B2(){}
	B2(int id,String name,double salary,String tool)
	{
		super(id,name,salary);
		this.tool=tool;
	}
	public boolean equals(Object ob)
	{
		B2 temp=(B2)ob;
		return super.equals(ob)&&this.tool.equals(temp.tool);
	}
	public int hashCode()
	{
		return super.hashCode()+tool.hashCode();
	}

}
