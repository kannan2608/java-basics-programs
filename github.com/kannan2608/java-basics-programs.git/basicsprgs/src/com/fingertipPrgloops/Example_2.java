package com.fingertipPrgloops;

public class Example_2 {

	public static void main(String[] args) {
	int no=1225;
	int no1=no;
	int rev=0;
	while(no>0)
	{
		int rem=no%10;
		rev=rev*10+rem;
		no=no/10;
	}
	System.out.println(rev);
	if(no1==rev)
	{
		System.out.println("given NUmber is palindrom");
	}
	else
		System.out.println("not a palindrom");
} }


