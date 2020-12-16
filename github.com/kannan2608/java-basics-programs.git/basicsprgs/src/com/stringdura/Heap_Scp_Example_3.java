package com.stringdura;

public class Heap_Scp_Example_3 {

	public static void main(String[] args) {

		String s1 = new String("You cant change me");
		String s2 = new String("You cant change me");
		System.out.println(s1 == s2);

		String s3 = "You cant change me";
		System.out.println(s1 == s3);

		String s4 = "You cant change me";
		System.out.println(s3 == s4);

		String s5 = "You cant" + " change me";
		System.out.println(s4 == s5);
	//ystem.out.println(s5);

		String s6 = "You cant";
		String s7 = s6 + "change me";
		System.out.println(s4 == s7);

		final String s8 = "You cant";
		String s9 = s8 +"change me";
		System.out.println(s4 == s9); //answer is true our answer is false some doing mistakes
		
		
		
		//advance of importance important string constant pool	
		
		
		
/*1.scp single object reference with multipule object
		
		2.code resuabilit
		
		*/
		
		
		
		
		
		
		
		
		

	}

}
