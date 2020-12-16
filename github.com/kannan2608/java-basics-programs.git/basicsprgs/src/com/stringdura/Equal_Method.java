package com.stringdura;

public class Equal_Method {

	public static void main(String[] args) {

		String s1 = new String("kannan");
		String s2 = new String("kannan");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));

		
		
		
		StringBuffer sb=new StringBuffer("kannan");
		StringBuffer sb1=new StringBuffer("Kannan");
		System.out.println(sb.equals(sb1));
		System.out.println(sb==sb1);
	}
	}

