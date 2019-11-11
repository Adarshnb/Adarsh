package com.constructor;

class Movie {
	int year;
	String name;
	double rating;
	Movie(int year,String name,double rating)
	{
		this.year=year;
		this.name=name;
		this.rating=rating;
		System.out.println(this.year);
		System.out.println(this.name);
		System.out.println(this.rating);
	}
	

}
