package com.stringpayilagam;

public class Searching_Methods {

	public static void main(String[] args) {
		
		String s1="payilagam chennai";
		         //012345678
		
		//1. indexof char 
		
		System.out.println("First occurrence of a= "+s1.indexOf('a') +"position");
		
		int res11=s1.indexOf('g');
		System.out.println(res11);
		
		//2. Index of String
		
         System.out.println(s1.indexOf("chennai"));
         
         int res12=s1.indexOf("chennai");
         System.out.println("The string is= "+res12+  "position");
         
         
         // 3. indexof from index char
         
         System.out.println(s1.indexOf('a', 9));
         
         int res1=s1.indexOf('e', 9);	
         System.out.println(res1);
		
         // 4. indexof from index using string
         
        int res2= s1.indexOf("nn",10);
        System.out.println(res2);
		
		
		//5.last index of char
        
       System.out.println("Last Index occurese is="+s1.lastIndexOf('n')+"position");
        
        
        System.out.println(s1.lastIndexOf('a'));
        
        
        String s4="payilagam chennai chennai chennai";
        
        
        //6. last index of string
        
        int res7=s4.lastIndexOf("chennai");
        System.out.println(res7);
        
        
        //7. last index of char fromindex
        System.out.println(s4.lastIndexOf('a', 24));
        
       
        //8. last index of string fromindex
        System.out.println(s4.lastIndexOf("chennai", 17 ));
	}
	

}
