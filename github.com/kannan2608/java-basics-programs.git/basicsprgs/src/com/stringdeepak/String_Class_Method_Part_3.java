package com.stringdeepak;

public class String_Class_Method_Part_3 {

	public static void main(String[] args) {

		// 1. adding using + symbool

		String s1 = "kannan";
		String s2 = "karthi";
		System.out.println(s1 + s2);
		System.out.println(s1 + 10);
		System.out.println(s1 + 10 + 20 + 30 + 40);
		System.out.println(10 + 20 + s1);
		System.out.println(s1 + 10 / 2);
		// System.out.println(s1+10-2); //error The operator - is undefined for the
		// argument type(s) String, int

		// 2.concat
		String res = s1.concat(s2);
		System.out.println(res);

		// 3. join method is a static method of a string class

		System.out.println(String.join("-", s1, s2));

		// String res2=String.join(null,s1,s2);
		// System.out.println(res2);

		// 4. Subsequence

		String s8 = "its just begining";

		System.out.println(s8.subSequence(4, 9));

		String s = s8.substring(4);
		System.out.println(s);

		System.out.println(s8.subSequence(2, 10));

	}

}
