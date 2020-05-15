package com.fingertipPrgloops;


public class Multuples_4_OR_9 {

	public static void main(String[] args) {
		int no = 1;
		System.out.println("The Multiples of 4 Or 9");
		while (no <= 88) {
			if ((no % 4 == 0) || (no % 9 == 0)) {
				System.out.println(no);
			}
			no++;
		}
	}

}
