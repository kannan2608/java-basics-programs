package com.starandnumberpattern;

public class NumberPattern1 {

	public static void main(String[] args) {
		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(row);
			}
			System.out.println();
		}
	}

}
/* Out Put

1
22
333
4444
*/