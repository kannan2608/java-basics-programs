package com.patternprg;
// printing C
public class PatternPrintc {

	public static void main(String[] args) {
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 3; col++) {
				if ((row == 1) || (row == 5)) {
					if (col == 1) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}

				else if (col == 1) {
					System.out.print("*");
				}
			}

			System.out.println();
		}
	}

}
