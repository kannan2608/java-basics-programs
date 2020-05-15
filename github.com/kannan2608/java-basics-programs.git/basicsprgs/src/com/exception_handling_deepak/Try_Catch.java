package com.exception_handling_deepak;

public class Try_Catch {

	public static void main(String[] args) {

		try {

			/*
			 * int a = 24, b = 0, c; c = a / b; System.out.println(c);
			 * 
			 */

			int[] a = { 10, 20, 30, 50, 40 };

			System.out.println(a[9]);

		} catch (Exception e) {
			System.out.println(e);
			System.out.println("you cant deived by zero");
		}
		
		
		
		
		

	}
}
