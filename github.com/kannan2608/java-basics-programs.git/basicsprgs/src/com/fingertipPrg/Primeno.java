package com.fingertipPrg;

public class Primeno {

	public static void main(String[] args) {
	int no=15;
	int i=2;
	boolean prime=true;
	while(i<no)
	{
		if(no%i==0)
			System.out.println("not a prime");
		i=i+1;
	}
	if(prime==true)
	{
		System.out.println("given number is a prime");
	}
	}
	

}
