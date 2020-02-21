package com.app.prgs;
import java.util.Scanner;

public class Average //average=(t+e+m+s+ss)/5
{

	public static void main(String[] args) 
	
	{
		Scanner obj=new Scanner(System.in);
		float avg,t,e,m,s,ss;
		System.out.println("Enter the Tamil Makr");
		t=obj.nextFloat();
		System.out.println("Enter the English Mark");
		e=obj.nextFloat();
		System.out.println("Enter the Maths Mark");
		m=obj.nextFloat();
		System.out.println("Enter the Science Mark");
		s=obj.nextFloat();
		System.out.println("Enter the Social Science marks");
		ss=obj.nextFloat();
		avg=(t+e+m+s+ss)/5;
		System.out.println("Average of the Mark is = "+avg);
	}

}
