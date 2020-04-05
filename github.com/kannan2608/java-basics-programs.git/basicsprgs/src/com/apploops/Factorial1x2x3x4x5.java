package com.apploops;

import java.util.Scanner;

public class Factorial1x2x3x4x5 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int no,f=1;
		System.out.println("Enter any number");
		no=obj.nextInt();
		for(int i=1; i<=5; i++)
		{
			f=f*i;
		}
		System.out.println("The factrols of"+ no + "is= "+f);
		
		
	}

}
