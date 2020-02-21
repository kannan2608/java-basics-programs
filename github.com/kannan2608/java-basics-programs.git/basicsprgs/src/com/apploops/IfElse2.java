package com.apploops;
import java.util.Scanner;

public class IfElse2 
{

	public static void main(String[] args) 
	{
	    Scanner obj=new Scanner(System.in);
	     int a,b;
	     System.out.println("enther first number");
	     a=obj.nextInt();
	     System.out.println("Enterh the second number");
	     b=obj.nextInt();
	     if(a>b)
	    	 System.out.println("a is g  rater then b");
	     if(b>a)
	    	 System.out.println("b is grater then a");
	     if(a==b)
	    	 System.out.println("boath are equal");
	     
	}

}
