package com.miscellaneous;

class Employee {
	int id;
	String name;
	int salary;
	Employee(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	static Employee createEmployee(int id,String name,int salary)
	{
		Employee ob=new Employee(id,name,salary);
		return ob;
	}
	Employee initialize(int salary)
	{
		this.salary=salary;
		return this;
	}
	Employee display()
	{
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.salary);
		return this;
	}
	

	public static void main(String[] args) {
		Employee ob1=createEmployee(100,"Adarsh", 10000).initialize(15000).display();
		Employee ob2=createEmployee(101, "Bushan", 12000).display().initialize(18000).display();
		ob2.initialize(500).display();
		
		
		
	}

}
