package com.patternprgfingertip;

public class NumberPattern11 {

	public static void main(String[] args) {
		for (int row = 1; row <= 3; row++) {
			for (int col = 2; col >= row; col--) {
				System.out.print(" ");
			}
			for (int col1 = 1; col1 <= row; col1++) {
				System.out.print(row);
			}
			System.out.println();
		}
	}

}


/* 
Out Put

  1 
 22
333

*/
