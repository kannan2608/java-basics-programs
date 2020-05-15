package com.stringpayilagam;

public class CharAt_SubString_Method {

	public static void main(String[] args) {
		
		
		
		//1.charAt particular character only can print not in string only character only print..
		
		String s1="Chennai is worst city";
		
		System.out.println(s1.charAt(2));
		//System.out.println(s1.charAt(100));
		//System.out.println(s1.charAt(-2));
		
		char res=s1.charAt(3);
		System.out.println(res);
		
		
		// 2. Substring use of print string more then one character 
		//beginning index, inclusive.       endIndex,  exclusive.
		
		String res1=s1.substring(2);
		System.out.println(res1);
		
		System.out.println(s1.substring(5));
		
		String res2=s1.substring(1, 10);
		System.out.println(res2);
		
		System.out.println(s1.substring(10, 18));
		
		
		// 3. SubSequence is work like same as substring bt it is a interface
		
	CharSequence res4=s1.subSequence(1, 10);
	System.out.println(res4);
	
	}

}
