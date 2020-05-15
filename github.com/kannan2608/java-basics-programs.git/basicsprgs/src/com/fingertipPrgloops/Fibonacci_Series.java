package com.fingertipPrgloops;

public class Fibonacci_Series {

	public static void main(String[] args) {
		int first = 0, second = 1;
		System.out.println("The Fibonacci Series are");
		for (int i = 1; i <= 9; i++) {
			System.out.println(first);
			int third = first + second;
			first = second;
			second = third;
		}
	}

}
