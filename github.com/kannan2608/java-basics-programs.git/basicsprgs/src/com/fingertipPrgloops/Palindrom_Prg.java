package com.fingertipPrgloops;

public class Palindrom_Prg {

	public static void main(String[] args) {
		int no = 9983;
		int no1 = no;
		int rev = 0;
		while (no > 0) {
			int rem = no % 10;
			rev = rev * 10 + rem;
			no = no / 10;
		}
		if (no1 == rev)
			System.out.println("given Number is Palindrom");
		else
			System.out.println("Given Number is Not a Palindrom");
	}

}
