package com.loopsprgs.muthu;

public class First20PrimeNo {

	public static void main(String[] args) {
		for(int no=3; no<=100; no+=2)
		{
		int primecount = 1;
		//int no = 3;
		//while (primecount < 50) {
			int div = 3;
			boolean check = true;
			if (no % 2 != 0) {
				while (div < no) {
					if (no % div == 0) {
//	    	                 	System.out.println("not a prime no");
						check = false;
						break;

					}
					div = div + 2;
				}
				if (check == true) {
					System.out.println(no + " = is a prime no");
					primecount++;
			
				} else {
					// System.out.println("not a prime");
				}

				{
					no = no + 2;
				}

			}

		}

	}
}
