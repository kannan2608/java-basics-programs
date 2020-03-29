package com.fingertipPrg;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int no,count=0;
		System.out.println("Enter any number");
		no=in.nextInt();
		for(int i=1; i<=no; i++)
		{
			if(no%i==0)
				count++;
		}
		if(count==2)
			System.out.println("number is a prime");
		else
			System.out.println("number is a not prime");
		}
	}


