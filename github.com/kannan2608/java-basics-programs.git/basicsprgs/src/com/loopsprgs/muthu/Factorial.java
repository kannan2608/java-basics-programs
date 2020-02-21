package com.loopsprgs.muthu;

public class Factorial {  //1*2*3*4*5

	public static void main(String[] args) {
		int fact = 1, no = 1;
		while (no <= 5) {
			fact = fact * no;
			no = no + 1;

		}
		System.out.println("the factorial is =" + fact);
	}

}
