package com.fingertipPrgloops;

public class Swapping_Using_Third_Variable {

	public static void main(String[] args) {
		int a=20,b=30,c;
		
		System.out.println("Before Swapping a vlaues is = "+ a);
		System.out.println("Before Swapping b vlaues is = "+ b);
		  
		c=a+b;
		b=c-b;
		a=c-a;
		
		System.out.println("After  Swapping a vlaues is = "+ a);
		System.out.println("After Swapping b vlaues is = "+ b);
		
		
	}

}
