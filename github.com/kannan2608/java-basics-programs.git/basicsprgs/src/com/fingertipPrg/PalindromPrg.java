package com.fingertipPrg;

public class PalindromPrg {

	public static void main(String[] args) {
	int no=15434;
	int no1=no;
	int rev=0;
	while(no>0)
	{
		int rem=no%10;
		rev=(rev*10)+rem;
		no=no/10;
	}
	System.out.println(rev);
	if(no1==rev)
		System.out.println("is a palindrom");
	else
	{
		System.out.println("is not a palindom");
	}

}
}
