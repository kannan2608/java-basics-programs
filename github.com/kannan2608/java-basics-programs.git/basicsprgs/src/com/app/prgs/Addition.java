package com.app.prgs;
import java.util.Scanner;

public class Addition 
{

	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner cock=new Scanner(System.in);

		System.out.println("Enter the A value");
		a=cock.nextInt();
		System.out.println("Enter the B value");
		b=cock.nextInt();
		c=a+b;
		System.out.println("The Addition is="+ c);
		
		
	}

}
