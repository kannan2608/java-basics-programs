package com.fingertipPrg;

public class FibonacciSeries // 0 1 1 2 3 5 8 13 17
{

	public static void main(String[] args) {

		int first = 0, second = 1;
		for (int i = 0; i <= 8; i++) {
			System.out.println(first);
			if(first==8)
			{
				break;
			}
			int third = first + second;
			first = second;
			second = third;
		}
	}

}
