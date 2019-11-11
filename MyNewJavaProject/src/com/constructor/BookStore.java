package com.constructor;

class BookStore {

	public static void main(String[] args) {
		Book a=new Book("abc",100,001);
		Book b=new Book("def",101,002);
		Book c=new Book("ghi",103,003);
		Book e=new Book("jkl",104,004);
		Book f=new Book("mno",105,005);
		Book bookshelf[]= {a,b,c,e,f};
		for(int i=0;i<bookshelf.length;i++)
		{
			System.out.println("name:"+bookshelf[i].name);
			System.out.println("price:"+bookshelf[i].price);
			System.out.println("isbn:"+bookshelf[i].isbn);
			bookshelf[i].genere("thriller");
		}
		for(Book x:bookshelf)
		{
			System.out.println("name:"+x.name);
			System.out.println("price:"+x.price);
			System.out.println("isbn:"+x.isbn);
			x.genere("thriller");
		}
			
			
		}
			
		

	}

