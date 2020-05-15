package com.fingertipPrgloops;

public class Swapping_Two_Numbers_WithOut_Using_Third_Variable {

	public static void main(String[] args) {
		int a=93,b=96;
		System.out.println("Before Swapping a is= "+a);
		System.out.println("Before Swapping b is= "+b);
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 System.out.println("After Swapping a is=" +a);
		 
		 System.out.println("After Swapping b is=" +b);
		
	}

}
