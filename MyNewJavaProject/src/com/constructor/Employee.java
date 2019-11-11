package com.constructor;

class Employee {
	String name;
	double salary;
	int id;
	Employee(String name,double salary,int id)
	{
		this.name=name;
		this.salary=salary;
		this.id=id;
		System.out.println("Employee name is "+name+" with id "+id+" and salary is "+salary);
	}
	public static void main(String[] args) {
		Employee a=new Employee("bharath",10000,100);
		Employee b=new Employee("sharath",12000,101);
		Employee c=new Employee("rajesh",15000,102);
	}

}
