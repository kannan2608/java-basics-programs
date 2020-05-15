package com.starandnumberpattern;

public class Number_Pattern_4 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}


/*

Out Put

1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1 

*/