package com.stringdeepak;

public class Comparing_Two_String_Using_Equal_Method {

	public static void main(String[] args) {
		String s1="kannan";
		String s2="karthi";
		String s3="kannan";
		String s4="KANNAN";
		// 1. equal
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equals(s3));
		
		// 2. equalsIngorecase
		
		System.out.println(s1.equalsIgnoreCase(s4));
		
		// 3. String empty checking method
		
	//	System.out.println(s1.equals(" "));
		
		if(s1.equals(""));
		{
			System.out.println("String is empty");
		}
	//	else
		{
			System.out.println("Valid name");
		}
		
       // 4. compare to
		
		String s5="a";
		String s6="A";
		String s7="b";
		
		System.out.println(s5.compareTo(s6));
		
		System.out.println(s6.compareTo(s7));
		
		
		
		
		
		
		
		
		
		
	}

}
