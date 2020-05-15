package com.exception_handling_deepak;

public class Methods_To_Print_Exception_Information {

	public static void main(String[] args) {

		try {
			int a = 99, b = 0, c;
			c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			// System.out.println(e);

			// 1. method 1 print
			e.printStackTrace();
			System.out.println("8");

			// 2.method 2

			System.out.println(e);

			System.out.println("hiii");

			System.out.println(e.toString());

			// 3. method 3
			System.out.println("30");

			System.out.println(e.getMessage());
		}

	}

}
