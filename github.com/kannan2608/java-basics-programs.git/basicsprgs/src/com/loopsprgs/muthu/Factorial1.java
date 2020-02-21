package com.loopsprgs.muthu;

public class Factorial1 {

	public static void main(String[] args) {
		int given = 5;
		do {
			int fact = 1;
			int no = 1;
			while (no <= given) {
				fact = fact * no;
				no = no + 1;

			}
			System.out.println("the factorial is=" + fact);
			given = given - 1;

		} while (given > 0);

	}

}
