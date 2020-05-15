package com.trickprograms;

import java.util.Scanner;

public class Add_Two_Number_Without_Using_Plus_Operator {

	public static void main(String[] args) {
	
		int num1;
		int num2;
		int add;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Two Numbers:");
		num1=s1.nextInt();
		num2=s1.nextInt();
		add=num1-(-num2);
		System.out.println("Addtion is= "+ add);
		
	}

}
