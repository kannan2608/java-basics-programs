package com.patternprg;

public class DpatternPrg {

	public static void main(String[] args) {
		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= 4; col++) {
				if ((row == 1) && (col == 4)) {
					System.out.print(" ");
				} else if ((row == 2) && ((col == 2) || (col == 3))) {
					System.out.print(" ");
				} else if ((row == 3) && ((col == 2) || (col == 3))) {
					System.out.print(" ");
				} else if ((row == 4) && (col == 4)) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			// TDO Auto-generated method stub
			System.out.println();

		}

	}
}
