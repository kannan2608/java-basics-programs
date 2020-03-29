package com.fingertipPrg;

public class Calculator {

	public static void main(String[] args) {

		Calculator casio = new Calculator();
		casio.add(4,6);
		casio.sub(9,8);

	}
	void add(int a,int b  )
	
	{
		int c=a+b; 
		System.out.println(c); 
	}
	void sub(int a, int b)
	{
		int c=a-b;
		System.out.println(c);
	}
}
