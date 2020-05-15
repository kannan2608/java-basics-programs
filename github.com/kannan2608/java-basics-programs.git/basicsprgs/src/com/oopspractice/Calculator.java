package com.oopspractice;

public class Calculator {

	public static void main(String[] args) {
		Calculator casio = new Calculator();
		int totalvalue = casio.add();

		casio.sub(totalvalue);

	}

	private void sub(int result) {
		System.out.println(result);  
		result = result - 2;
		System.out.println("The reslut is=" + result);

	}

	private int add() {
		int tamil = 90, eng = 80;
		int total = tamil - eng;
		System.out.println("The total is:" + total);
		return total;

		// TODO Auto-generated method stub

	}

}
