package com.patternprgAtoZ;

public class XpatternPrg {

	public static void main(String[] args) {

		for (int row = 1; row <= 3; row++) {
			for (int col = 1; col <= 3; col++) {
				if ((row == 1) && (col == 2)) {
					System.out.print(" ");
				} else if ((row == 2) && ((col == 1) || (col == 3))) {
					System.out.print(" ");
				} else if ((row == 3) && (col == 2)) {
					System.out.print(" ");
				}

				else {
					System.out.print("*");
				}
			}

			System.out.println();
		}

	}

}
