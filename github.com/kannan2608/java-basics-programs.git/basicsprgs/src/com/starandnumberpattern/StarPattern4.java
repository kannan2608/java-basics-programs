package com.starandnumberpattern;

public class StarPattern4 {

	public static void main(String[] args) {
		for (int row = 1; row <= 4; row++) {
			for (int col = 4; col >= row; col--) {
				System.out.print(" ");
			}
			for (int row1 = 1; row1 <= row; row1++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

/* Out put
 
 
    *
   **
  ***
 ****


*/
