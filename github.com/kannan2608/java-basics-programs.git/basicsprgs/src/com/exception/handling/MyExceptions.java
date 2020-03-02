package com.exception.handling;

class MyExceptions extends Exception {

	public MyExceptions(String s) {
		Super(
	}


	})
}

public class main {
	public static void main(String[] args) {
		try {
			throw new MyExceptions("Userdefind Exception");

		} catch (MyException e) {
			System.out.println("empty");
		}
	}

}
