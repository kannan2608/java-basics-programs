package com.stringmuthu;

public class SamplePrg {

	public static void main(String[] args) {

		String s1 = "kannan";

		String s2 = "kannan";
		String s3 = new String("kannan");
	//	String s4 = new String("kannan");
		System.out.println(s1);
		if (s1  == s3 ) {
			System.out.println("equal");

		} else {
			System.out.println("not equal");
			
			
		}

	}
}
