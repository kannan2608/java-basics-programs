package com.fingertipPrg;

public class Palindrom {

	public static void main(String[] args) {
		int no = 1256;
		int no2 = no;
		int rev = 0;
		while (no > 0) {

			int rem = no % 10;
			rev = (rev * 10) + rem;
			no = no / 10;

		}
		System.out.println(rev);
if(rev==no2)
{
	System.out.println("is a palindrom");
}
else
{
	System.out.println("Is not a palindrom");
}
	}

}
