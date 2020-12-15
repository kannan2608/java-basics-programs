package com.apploops;
import java.util.Scanner;

public class GraterThenUserInput  // if condtion
{

	public static void main(String[] args)
	{
	   Scanner obj=new Scanner(System.in);
	   int a=55;
	   int b=55;
	   System.out.println("enter any number");
	   a=obj.nextInt();
	   if(a>55)
		   System.out.println("number is greater then");
	   if(a<55)
		   System.out.println("number is less then");
	   if(a==55)
		   System.out.println("number is equal");
	  
		
	}

}
