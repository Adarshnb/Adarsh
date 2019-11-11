package com.constructor;

class Book {
	String name;
	int price;
	int isbn;
	Book(){
		
	}
	Book(String name,int price,int isbn)
	{
		this.name=name;
		this.price=price;
		this.isbn=isbn;	
	}
	void genere(String type)
	{
		System.out.println("the book "+name+" of price "+price+" is of genere "+type);
	}
	
	
	

}
