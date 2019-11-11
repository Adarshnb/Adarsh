package com.miscellaneous;



class Aa {
	
		String name;
		String singer;
		Aa(String name,String singer)
		{
			this.name=name;
			this.singer=singer;
			
		}
		static void songDis(Aa Adarsh)
		{
			System.out.println(Adarsh.name);
			System.out.println(Adarsh.singer);
		}

		public static void main(String[] args) {
			Aa a=new Aa("love you","asdfgh");
			Aa b=new Aa("hate you","jmoih");
			songDis(a);
			songDis(b);
			
			
			
		}


	}

