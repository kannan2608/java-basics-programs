package com.fingertipPrgloops;

import java.util.Scanner;

public class Prime_Number_Using_Scanner_User_Input {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enther the Number");

		int no = obj.nextInt();
		int temp = 0;
		for (int i = 2; i <= no - 1; i++) {
			if (no % i == 0) {
				temp = temp + 1;
			}
		}
		if (temp == 0) {
			System.out.println("Given Number is PrimeNumber");
		} else {
			System.out.println("Given Number is Not PrimeNumber");
		}
	}
}
