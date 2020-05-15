package com.oops_deepak;

public class Animal_1 {

	public void eat() {
		System.out.println("i'm eatting");
	}

	public static void main(String[] args) {
		System.out.println("ji");
		Animal_1 dog=new Animal_1();
		dog.eat();
		dog.run();
		
		Animal_1 pig=new Animal_1();
		pig.eat();
		pig.run();

	}
	public void run()
	{
		System.out.println("i', running");
	}

}
