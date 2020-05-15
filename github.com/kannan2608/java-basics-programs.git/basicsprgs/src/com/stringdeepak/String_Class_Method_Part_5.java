package com.stringdeepak;

public class String_Class_Method_Part_5 {

	public static void main(String[] args) {

		// Searching Methods

		// 1. index of

		String s = "lotte kans is here";

		int res = s.indexOf('t');
		System.out.println(res);

		System.out.println(s.indexOf("kans"));
		System.out.println(s.indexOf('x'));


		// 2.last index of

		int res2 = s.lastIndexOf('e');
		System.out.println(res2);
		
		System.out.println(s.lastIndexOf("here"));
		
		// 3.charAts
		
		
           char res4=s.charAt(2);
           System.out.println(res4);
           
           
           // 4.contains
           
           boolean res3=s.contains("kans");
           System.out.println(res3);
           
           
           // 5. start with
           
           System.out.println(s.startsWith("l"));
           System.out.println(s.startsWith("k"));
           
           // 6. end with
           
           
           System.out.println(s.endsWith("here"));
           
           
           
           
           
           
	}

}
