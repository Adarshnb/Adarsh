package com.constructor;

class Loan {
	String name;
	double roi;
	Loan(String name,double roi)
	{
		this.name=name;
		this.roi=roi;
		//System.out.println("name is: "+name+ " and rate of interest is: "+ roi);
		
	}
	void Interest()
	{
		System.out.println(name+" is granted at "+roi +"%");
	}

	public static void main(String[] args) {
		Loan a =new Loan("car loan",12.5);
		Loan b=new Loan("home loan",15.2);
		Loan[] loan= {a,b};
		for(int i=0;i<loan.length;i++)
		{
			System.out.println(a.name +" "+ a.roi);
			loan[i].Interest();	
		}
		
	}

}
