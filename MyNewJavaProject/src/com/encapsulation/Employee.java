package com.encapsulation;

public class Employee {
	private int id;
	private String name;
	double salary;
	public Employee() {}
	public Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double readSalary()
	{
		return salary;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}

}
