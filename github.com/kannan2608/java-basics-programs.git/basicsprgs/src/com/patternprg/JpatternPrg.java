package com.patternprg;

public class JpatternPrg {

	public static void main(String[] args) {
		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= 5; col++) {
				if ((row == 2) && (((col == 1) || (col == 2)) || ((col == 4) || (col == 5)))) {
					System.out.print(" ");
				} else if ((row == 3) && ((col == 2) || (col == 4) || (col == 5))) {
					System.out.print(" ");
				} else if ((row == 4) && ((col == 4) || (col == 5))) {
					System.out.println(" ");

				} else {
					System.out.print("*");
				}
			}
			// TODO Auto-generated method stub
			System.out.println();
		}

	}
}
