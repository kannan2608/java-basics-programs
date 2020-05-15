package com.fingertipPrg;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int no = 13, no1 = no;
		int arm = 0;
		while (no > 0) {
			int rem = no % 10;
			arm = arm + (rem * rem * rem);
			no = no / 10;

		} 
		if (no1 == arm)
			System.out.println("given number is ArmstrongNUmber");
		else {
			System.out.println("not ArmstrongNUmber");
		}

	}

}
