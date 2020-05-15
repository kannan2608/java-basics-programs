package com.trickprograms;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
	int a;
	int b;
	int add;
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter two Numbers");
	a=s1.nextInt();
	b=s1.nextInt();
	add=a-(-b);
	System.out.println("The additon is="+add);
	}

}
