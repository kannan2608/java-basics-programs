package com.oops_deepak;

public class Animal_2 {
	// by using method

	String color;
	int age;

	void intobj(String c, int a) {
		color = c;
		age = a;
	}

	void display() {
		System.out.println(color + " " + age);
	}

	public static void main(String[] args) {

		Animal_2 dog = new Animal_2();
		dog.intobj("rocjy", 9);
		dog.display();
	}

}
