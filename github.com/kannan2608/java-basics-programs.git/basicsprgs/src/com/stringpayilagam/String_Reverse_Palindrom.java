package com.stringpayilagam;

public class String_Reverse_Palindrom {

	public static void main(String[] args) {

		// 1. Reverse A String

		/*
		 * String name="kannan";
		 * 
		 * for(int i=name.length()-1; i>=0; i--) { System.out.print(name.charAt(i)); }
		 */

		// 2. palindrom

		String s = "VTV";

		String s1 = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			s1 = s1 + s.charAt(i);
		}
		System.out.println(s1);

		if (s.equals(s1))
			System.out.println("palindrom");
		else
			System.out.println("not a palindrom");

	}

}
