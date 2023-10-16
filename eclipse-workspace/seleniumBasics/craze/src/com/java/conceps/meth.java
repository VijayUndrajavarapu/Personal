package com.java.conceps;

public class meth {
	public void add(int a, int b) { 	//paramaterized method
		int c =a +b;
		System.out.println(c);
	}
	public static void main(String[] args) {	//main method
		meth a1 = new meth();
		a1.add(10, 20);
		
		if (10<20)						//if condition
			System.out.println("Trud");
			if (10<15)
				System.out.println("10 less than 15 check ");
		else 
			System.out.println("false");
			
		for (int i=0;i<=10;i++)
			System.out.println(i);
	}
	
//	public meth() {							//constructor
//		System.out.println("Constructor");
//	}
}
