package com.loopsprgs.muthu;

public class PrimeNo{

	public static void main(String[] args) {
		int no = 17, div = 3;
		boolean check = true;
		if (no % 2 != 0) {
			while (div < no) {
				if (no % div == 0) {
					System.out.println("not a prime no");
					check = false;
					break;

				}
				div = div + 2;
			}
			if (check == true) {
				System.out.println("is a prime no");
			} if(no%2==0){
				System.out.println("not a prime");
			}
		}
	}
}
