package com.fingertipPrgloops;

public class Armstrong_Number {

	public static void main(String[] args) {
		int no = 153;
		int arm = 0;
		int no1 = no;

		while (no > 0) {
			int rem = no % 10;
			arm = arm + (rem * rem * rem);
			no = no / 10;

		}
		if (arm == no1)
			System.out.println("Given Number is Armstrong Number");
		else
			System.out.println("Given Number is Not Armstrong Number");
	}

}
