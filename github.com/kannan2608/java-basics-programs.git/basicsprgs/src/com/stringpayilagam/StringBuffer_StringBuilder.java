package com.stringpayilagam;

public class StringBuffer_StringBuilder {

	public static void main(String[] args) {
		
		
		//when string object needs to be modified very ofter, we shot not use string object.therfore using stringbuffer class
		
		String s="hi";
		s=s+5;
	System.out.println(s);
		/*
		for(int i=0; i<=100; i++) {
			s=s+i;
			System.out.println(s);
			}
			*/
			StringBuffer sb=new StringBuffer("kannan");
			
			StringBuffer res=sb.append("2koil");
			System.out.println(res);
		
			
			StringBuffer res2=sb.deleteCharAt(2);
			System.out.println(res2);
			
		StringBuffer res3=	sb.reverse();
		System.out.println(res3);
		
		 StringBuffer s1=new StringBuffer("hdfc bank");
		
		
		StringBuffer res4=s1.replace(0, 9, "chennai");
		System.out.println(res4);
		
		
		//java 1.5 after introduce StringBuilder class
		
		/* StringBuilder is a =>non synchronized class
		 
		 synchronized means multithread concept
		 
		 StringBuffer is a => Sychronized class
		 
		 * 	 */
		
		
		
	}

}
