package com.patternprgfingertip;

public class NumberPattern16 {

	public static void main(String[] args) {
		for (int row =3; row>=3; row--) {
			for (int space = 0; space<= row; space++) {
				System.out.print(" ");
			}
			for (int no1 =1 ; no1>=row; no1++) {
				System.out.print(no1);
			}
			for (int no2=2; no2>= row; no2--) {
				System.out.print(no2);
			}
			System.out.println();
		}
	}

}


/*

3211
3212
 3123
*/