package com.fingertipPrg;

public class PalindromPrg {

	public static void main(String[] args) {
		int no=92909291;
		int rev=0;
		int no1=no;
		while(no>0)
		{
			int rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
			
		}
		System.out.println("the reverise a number is="+rev);
		if(no1==no)
			System.out.println("is a palindrom");
		else
		{
			System.out.println("is not a palindrom");
		}
	}

}
