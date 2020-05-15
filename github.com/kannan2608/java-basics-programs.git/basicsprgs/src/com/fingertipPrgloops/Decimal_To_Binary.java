package com.fingertipPrgloops;

public class Decimal_To_Binary {

	public static void main(String[] args) {
		int decimal = 10;
		String binary = "";
		while (decimal > 0) {
			int rem = decimal % 2;
			binary = rem + binary;
			decimal = decimal / 2;

		}
		System.out.println(binary);

	}
}
