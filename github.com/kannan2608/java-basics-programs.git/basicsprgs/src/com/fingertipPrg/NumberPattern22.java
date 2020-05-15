package com.fingertipPrg;

public class NumberPattern22 {

	public static void main(String[] args) {
		for (int row = 1; row <= 3; row++) {
			for (int space = 2; space >= row; space--) {
				System.out.print(" ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print(col);
			}
			for (int col1 =1; col1<row; col1++) {
				System.out.print(col1);
			}
			System.out.println();

		}
	}
}


/* Out Put
 
 
   1
  121
 12312
 
 */ 

