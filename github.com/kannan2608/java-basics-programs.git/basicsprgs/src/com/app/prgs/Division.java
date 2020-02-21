package com.app.prgs;

import java.util.Scanner;

public class Division 
{

	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		float a,b,c;
		System.out.println("Enter the a value");
		a=obj.nextInt();
		System.out.println("Enter the b value");
		b=obj.nextInt();
		c=a/b;
		System.out.println("The Division is = "+c);
		
		
	}

}
