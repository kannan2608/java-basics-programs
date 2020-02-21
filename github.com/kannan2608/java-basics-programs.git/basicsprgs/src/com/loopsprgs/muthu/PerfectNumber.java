package com.loopsprgs.muthu;

public class PerfectNumber {

	public static void main(String[] args) {
		int sum = 0, no = 15;
		{
			for (int i = 1; i < no; i++) {
				if (no % i == 0)
					sum = sum + i;
			}
			if (sum == no)
			{
				System.out.println("is a perfect Number");
		}
			else {
				System.out.println("is not perfect Number");
			}
		}
	}
}
