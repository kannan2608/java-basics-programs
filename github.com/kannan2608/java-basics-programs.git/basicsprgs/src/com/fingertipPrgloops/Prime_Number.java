package com.fingertipPrgloops;

public class Prime_Number {

	public static void main(String[] args) {
		int no = 7, temp = 0;

		for (int i = 2; i <= no - 1; i++) {
			if (no % i == 0) {
				temp = temp + 1;

			}
		}
		if (temp== 0)

			System.out.println("Number is Prime");
		else
			System.out.println("Number is Not  prime");

	}

}
