package com.fingertipPrg;

public class NumberPattern17 {

	public static void main(String[] args) {
		for (int row = 3; row >= 1; row--) {
			for (int col = 2; col >= row; col--) {
				System.out.print(" ");
			}
			for (int col1 = 1; col1 <= row; col1++) {
				System.out.print(col1);
			}
			System.out.println();

		}

	}

}

/* Out Put
 
 
 123
  12
   1
*/