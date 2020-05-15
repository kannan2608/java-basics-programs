package com.fingertipPrgloops;

public class Perfect_Number {

	public static void main(String[] args) {
		int no = 28;
		int perfect = 0;
		int i = 1;
		while (i <= no) {
			if (no % i == 0)

				i = i + 1;
		}
		if (no == perfect) {
			System.out.println("Given Number is Perfect Number");
		} else {
			System.out.println("Not Perfect Number");
		}

	}
}
