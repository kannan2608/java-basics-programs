package com.patternprgfingertip;

public class NumberPattern15 {

	public static void main(String[] args) {
		for (int row = 1; row <= 3; row++) {
			for (int space=2; space>= row; space--) {
				System.out.print(" ");
			}
			for (int no1 =1; no1<=row; no1++) {
				System.out.print(no1);
			}
			for(int no2=1; no2<row; no2++) {
			System.out.print(no2);
 
		}
			System.out.println();

	}

}
}


/* Out put

  1
 121
12312

*/
