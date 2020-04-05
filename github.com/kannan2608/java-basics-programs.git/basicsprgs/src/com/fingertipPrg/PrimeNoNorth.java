package com.fingertipPrg;

public class PrimeNoNorth {
	public static void main(String[] args) {
		int no = 43;
		int temp = 0;
		for (int i = 2; i <= no - 1; i++) {
			if (no % i == 0) {
				temp = temp + 1;

			}
		}
		if (temp == 0) {
			System.out.println("is a prime no");

		} else {
			System.out.println("is not a prime no");
		}
	}

}