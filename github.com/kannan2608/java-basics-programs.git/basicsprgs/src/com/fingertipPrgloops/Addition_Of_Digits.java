package com.fingertipPrgloops;

public class Addition_Of_Digits {

	public static void main(String[] args) {
		int no = 987654;
		int total = 0;
		while (no > 0) {
			int rem = no % 10;
			total = total + rem;
			no = no / 10;

		}
		System.out.println("The Addition of Digits is =" + total);
	}

}
