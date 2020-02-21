package com.loopsprgs.muthu;

public class ReverseOrder1 {

	public static void main(String[] args) {
		int no = 587469;
		int rev = 0;
		while (no > 0) {
			int rem = no % 10;
			rev = (rev * 10) + rem;
			no = no / 10;
		}
		System.out.println(rev);
	}

}
