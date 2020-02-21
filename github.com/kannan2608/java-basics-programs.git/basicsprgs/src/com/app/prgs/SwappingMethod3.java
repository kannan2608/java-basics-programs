package com.app.prgs;
import java.util.Scanner;

public class SwappingMethod3//without using 3rd variable
{

	public static void main(String[] args) 
	{
		 Scanner obj=new Scanner(System.in);
		 int a=10,b=20,c;
		 System.out.println("Before Swapping a= "+a+ " b ="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swappiing a = "+a+ " b = "+b );
		
		 
	}

}
