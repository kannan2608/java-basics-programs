package com.patternprgAtoZ;

public class WpatternPrg {

	public static void main(String[] args) {

		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 5; col++) {
				if ((row == 1) && ((col == 2) || (col == 3) || (col == 4))) {
					System.out.print(" ");
				} else if ((row == 2) && ((col == 2) || (col == 3) || (col == 4))) {
					System.out.print(" ");
				} else if ((row == 3) && ((col == 2) || (col == 4))) {
					System.out.print(" ");
				} else if ((row == 4) && (col == 3)) {

					System.out.print(" ");
				} else if ((row == 5) && ((col == 2) || (col == 3) || (col == 4))) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			System.out.println();
		}
	}

}
