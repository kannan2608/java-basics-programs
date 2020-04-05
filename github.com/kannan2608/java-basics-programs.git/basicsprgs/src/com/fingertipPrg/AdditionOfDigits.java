package com.fingertipPrg;

public class AdditionOfDigits {

	public static void main(String[] args) {
		int no=56789;
		int total=0;
		while(no>0)
		{
			int rem=no%10;
		//   reverse a number just one line only changed
			//total=(total*10)+rem;
		total=total+rem;
			no=no/10;
		}
		System.out.println(total);
	}

}
