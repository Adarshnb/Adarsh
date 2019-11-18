package com.toStrings;

public class C2 extends A2 {
	String lang;
	C2(){}
	C2(int id,String name,double salary,String lang)
	{
		super(id,name,salary);
		this.lang=lang;
	}
	public boolean equals(Object ob)
	{
		C2 temp=(C2)ob;
		return super.equals(ob)&&this.lang.equals(temp.lang);
	}
	public int hashCode() 
	{
		return super.hashCode()+lang.hashCode();
		
	}

}
