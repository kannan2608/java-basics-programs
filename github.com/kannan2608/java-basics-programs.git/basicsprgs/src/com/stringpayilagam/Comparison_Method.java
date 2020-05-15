package com.stringpayilagam;

public class Comparison_Method {

	public static void main(String[] args) {

		String s1 = new String("java is a best prg lang");
		String s2 = new String("JAVA");
		String s3 = new String("java is a best prg lang");
		// 1. equals
		boolean res = s1.equals(s2);
		System.out.println(res);
		
		// 2.equalIngnoreCase
		boolean res1 = s1.equalsIgnoreCase(s2);
		System.out.println(res1);

		/*
		 * compaereTo 3 result
		 
		 * 1.boath are same res is=0, 2. first vaule is small then second velue is big
		 * res is=nagative value example -8 3. first value big second value is small res
		 * is=pastive value ex=94
		 */
		
		//3.comparetTo
		
		int res3 = s1.compareTo(s2);
		System.out.println(res3);
		
		// 4.comparetoignorecase

		int res4 = s1.compareToIgnoreCase(s2);
		System.out.println(res4);

		// 5.start with 

		boolean res5 = s1.startsWith("j");
		System.out.println(res5);
		
		// 6.Start with tooffset

		boolean res6 = s1.startsWith("java", 5);
		System.out.println(res6);
	

		//7. ends with
		boolean res7 = s1.endsWith("prg");
		System.out.println(res7);
		
		// 8.contentEquals char sequence

		boolean res8 = s1.contentEquals(s3);
		System.out.println("content=  "+res8);
		
		//9. contentEqual Stringbuffer

		StringBuffer s6 = new StringBuffer("JAVA");

		boolean res9 = s2.contentEquals(s6);
		System.out.println(res9);

	}

}
