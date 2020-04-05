package com.fingertipPrg;

public class FibonacciSeries1 {

	public static void main(String[] args) {
		int first=0, second=1;
		for(int i=0; i<=24; i++)
		{
			int third=first+second;
			first=second;
			second=third;   
			System.out.println(second);

		}
			}

}
