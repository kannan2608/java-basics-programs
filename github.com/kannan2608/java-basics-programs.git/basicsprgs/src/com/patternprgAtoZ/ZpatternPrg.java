package com.patternprgAtoZ;

public class ZpatternPrg {

	public static void main(String[] args) {
		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= 4; col++) {

				if ((row == 2) && ((col == 1) || (col == 2) || (col == 4))) {
					System.out.print(" ");
				} else if ((row == 3) && ((col == 1) || (col == 3) || (col == 4))) {
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
