package com.fingertipPrg;

public class NumberPattern16 {

	public static void main(String[] args) {
		for (int row = 3; row >= 1; row--) {
			for (int col = 1; col < row; col++) {
				System.out.print(" ");
			}
			for (int col1=1; col1<=row; col1++) {
				System.out.print(row);
			}
			System.out.println();
		}

	} 

}
