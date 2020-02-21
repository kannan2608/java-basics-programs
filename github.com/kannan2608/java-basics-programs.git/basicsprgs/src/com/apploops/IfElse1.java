package com.apploops;
import java.util.Scanner;

public class IfElse1 
{
 public static void main(String[] args)
 {
	 Scanner obj=new Scanner(System.in);
			 int no;
			 System.out.println("Enter any number");
			 no=obj.nextInt();
			 if(no%2==0)
				 System.out.println("number is even");
			 else
			    System.out.println("number is odd");
			 
 }
 
}
