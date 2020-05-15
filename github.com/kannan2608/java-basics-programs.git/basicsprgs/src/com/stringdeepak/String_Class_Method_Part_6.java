package com.stringdeepak;

public class String_Class_Method_Part_6 {

	public static void main(String[] args) {

		// String conversiont Methods

		// case converstion 1. upper case

		String s = "it not good";

		String s1 = "LOTTE KANS";

		String res = s.toUpperCase();

		System.out.println(res);

		// 2. Lower case

		System.out.println(s1.toLowerCase());

		/*
		 * 3. valueof() method converts different types of values into string. by the
		 * help of string. valueof() method we can convert int or long or float or
		 * double or object or any other type into string
		 * 
		 * NOTE: valueof() method is static method thats why we can call valueof()
		 * method directly by string class.
		 */

		int a = 10, b = 20;
		String k = String.valueOf(a);
		System.out.println(k);

		String k1 = String.valueOf(b);
		System.out.println(k + k1);
		
		// 4.char[] 
		
		
		String t="kdfjkglkjsl";
		
		char[] st=t.toCharArray();
		System.out.println(st);
	}

}
