package com.patternprgAtoZ;

public class PrintL {

	public static void main(String[] args) {
		for (int row = 1; row <= 4; row++) {

			for (int col = 1; col <= 5; col++) {
				if (((row == 1) || (row == 2) || (row == 3))
						&& ((col == 2) || (col == 3) || (col == 4) || (col == 5))) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}
}
