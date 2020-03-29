package com.string;

public class SamplePrg
{
	
	String a="apple";
    String b="mango";
    String c="banana";
    

	public static void main(String[] args) 
	{
       String java="In Java, string is basically an object that represents sequence of char values.";
 
     int res1=java.charAt(4); //charAt() method returns a char value at the given index number.
       System.out.println(res1);
        
       int res2=java.codePointAt(5);  //
       System.out.println(res2);
       
       String a="apple";
       String b="mango";
       String c="banana";
       
        String res3=a.concat(b).concat(c);
        System.out.println(res3);
       
        int res4=java.indexOf('s');
        System.out.println(res4);
        
        String res5=java.intern();
        System.out.println(res5);
        
       // int res6= java.lastIndexOf('b');  
        System.out.println(java.lastIndexOf('b'));
        
        int res7= java.length();
        System.out.println(res7);
        
        String res8= java.replace('J','A');
        System.out.println(res8);
        
        boolean res9= java.startsWith("I");
        System.out.println(res9);
        
        boolean res10=java.endsWith("j");
        System.out.println(res10);
        
       
        String res11=java.substring(5,15);
        System.out.println(res11);
        
       String res12= java.toLowerCase();
       System.out.println(res12);
       
       String res13=java.toUpperCase();
       System.out.println(res13);
       
       String res14=java.trim();
       System.out.println(res14);
       
       
       
       
       String[] res15=java.split(" & ");
       for(int i=0; i<=java.length(); i++)
       
       {
       System.out.println(res15[i]);
       }
     
           
        
       
       
	}

}
