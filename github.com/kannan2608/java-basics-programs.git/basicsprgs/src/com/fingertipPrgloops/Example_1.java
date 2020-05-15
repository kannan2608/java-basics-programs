package com.fingertipPrgloops;

public class Example_1 {

	public static void main(String[] args) {

		int binary = 4;
		String decima = " ";

		while (binary > 0) {
			int rem = binary % 2;
			decima = rem + decima;
			binary = binary / 2;

		}
		System.out.println(decima);
	}
}
