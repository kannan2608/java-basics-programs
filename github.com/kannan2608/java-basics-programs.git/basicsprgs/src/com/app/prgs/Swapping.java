package com.app.prgs;
import java.util.Scanner;
public class Swapping // method 1 Swapping means a=20 b=30 after swapping 
                       // a=30 b=20
{

	public static void main(String[] args) 
	
	{
	   Scanner obj=new Scanner(System.in);
	   int a=87,b=99,c;
	   System.out.println("Before Swapping a = "+ a + " b= "+ b);
	   c=a;
	   a=b;
	   b=c;
	   System.out.println("After Swapping a = "+ a + " b=" + b); 

	   
	}

}
