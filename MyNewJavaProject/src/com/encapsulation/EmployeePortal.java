package com.encapsulation;

public class EmployeePortal {
	public static void main(String[] args) {
		
	Employee emp=new Employee(101,"Adarsh",50000);
		System.out.println("employee name is "+emp.getName());
	System.out.println("employee ID is "+ emp.getId());
	System.out.println("employee salary is "+emp.readSalary());
	emp.setSalary(60000);
	System.out.println("employee salary is "+emp.readSalary());
	

			}

			

}
