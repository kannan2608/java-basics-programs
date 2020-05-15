package com.fingertipPrg;

public class MiniProject {

	public static void main(String[] args) {
		for (int state = 1; state <= 29; state++) {
			for (int dis = 1; dis <= 30; dis--) {
				for (int school = 1; school <= 10; school++) {
					for (int student = 1; student <= 5; student++) {
						int total = 0;
						for (int count = 1; count <= 5; count++) {
							int mark = 44;
							total = total + mark;
							int presentage = total / 5;
						}
						System.out.println(total);
					}
				}
			}
		}
	}
}