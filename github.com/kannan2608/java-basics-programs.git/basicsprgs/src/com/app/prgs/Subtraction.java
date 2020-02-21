package com.app.prgs;
import java.util.Scanner;
public class Subtraction
{

	public static void main(String[] args)
	{
	
		Scanner obj=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the a value");
		a=obj.nextInt();
		System.out.println("Entehr the b value");
		b=obj.nextInt();
		c=a-b;
		System.out.println("The Subtraction is="+c);
	
	}

}
