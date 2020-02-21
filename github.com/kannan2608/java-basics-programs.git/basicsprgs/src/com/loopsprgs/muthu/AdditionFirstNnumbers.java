package com.loopsprgs.muthu;

public class AdditionFirstNnumbers {  //1+2+3+4+5+6+7+8+9+10

	public static void main(String[] args) {
		int no = 1, total = 0;

		while (no <= 10) {
			total = total + no;
			no = no + 1;
			System.out.println( "Addition of first N Numbers ="+total);
		}
		//System.out.println( "Addition of first N Numbers ="+total);

	}
}
