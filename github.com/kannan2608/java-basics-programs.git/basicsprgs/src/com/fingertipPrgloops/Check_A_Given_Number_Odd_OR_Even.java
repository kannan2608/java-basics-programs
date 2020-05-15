package com.fingertipPrgloops;

import java.util.Scanner;

public class Check_A_Given_Number_Odd_OR_Even {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter The Any Number");
		Scanner obj=new Scanner(System.in);
		num=obj.nextInt();
		if(num%2==0)
			System.out.println("Given Number is Even Number");
		else
			System.out.println("Given Number is Odd Number");
		
	}

}
