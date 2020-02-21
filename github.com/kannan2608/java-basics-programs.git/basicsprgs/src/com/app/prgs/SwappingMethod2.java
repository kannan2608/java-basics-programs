package com.app.prgs;
import java.util.Scanner;
public class SwappingMethod2
{

	public static void main(String[] args) 
	{
        Scanner obj=new Scanner(System.in);
        int a=20,b=30,c;
        System.out.println("Before Swapping a ="+a+" b="+b);
        c=a+b;
        a=c-a;
        b=c-b;
        System.out.println("After Swapping a= "+a+ " b="+b);
		
	}

}
