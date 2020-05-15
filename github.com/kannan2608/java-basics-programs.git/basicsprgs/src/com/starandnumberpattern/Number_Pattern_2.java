package com.starandnumberpattern;

public class Number_Pattern_2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
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
4444


*/