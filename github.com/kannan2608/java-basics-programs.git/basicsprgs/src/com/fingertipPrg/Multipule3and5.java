package com.fingertipPrg;

public class Multipule3and5 {

	public static void main(String[] args) {
		/*
		 * // using nested if int no=1; while(no<=20) { if(no%2==0) { if(no%5==0) {
		 * System.out.println(no);
		 * 
		 * } }no++; }
		 */

		int no = 1;
		while (no <= 20) {
			// if ((no % 3== 0) && (no % 5 == 0))
			if ((no % 3 == 0) || (no % 5 == 0)) {

				System.out.println(no);

			}

			no++;
		}

	}
}
