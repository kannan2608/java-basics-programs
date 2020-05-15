package com.fingertipPrgloops;

public class Factorial_Prg {

	public static void main(String[] args) {
		int no = 5;
		int fact = no;
		while (no > 1) {
			no--;
			fact = fact * no;

		}
		System.out.println("The Factotial is= " + fact);
	}

}
