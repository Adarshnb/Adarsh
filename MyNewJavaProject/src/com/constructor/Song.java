package com.constructor;

class Song {
	String name;
	String singer;
	Song(String name,String singer)
	{
		this.name=name;
		this.singer=singer;
		System.out.println("song is : "+name+" sung by : "+singer);
		
	}

	public static void main(String[] args) {
		Song a=new Song("love you","asdfgh");
		Song b=new Song("hate you","jmoih");
		
		
		
	}

}
