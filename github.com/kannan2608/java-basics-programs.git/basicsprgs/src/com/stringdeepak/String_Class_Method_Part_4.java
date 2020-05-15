package com.stringdeepak;

public class String_Class_Method_Part_4 {

	public static void main(String[] args) {
		
		// 1.replace
		
		String s="this is beging";
		System.out.println(s.replace("is","was"));
		
		// 2.replace first
		
    String res=	s.replaceFirst("is", "kannan");
    
    System.out.println(res);
    
    // 3. replace all
    
    /* replace and replace all same out put bt replace support regular express
     * but replace not support that only different
     */
    
      String  res1=s.replaceAll("be", "good");
      System.out.println(res1);
      
      System.out.println(s.replaceAll("is(.)","was"));
      
      System.out.println(s.replaceAll("is(.*)","was"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
