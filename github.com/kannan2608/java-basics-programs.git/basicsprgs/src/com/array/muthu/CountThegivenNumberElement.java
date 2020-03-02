package com.array.muthu;

public class CountThegivenNumberElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr2 = { 10, 20, 30, 40, 10, 10, 10, 50 };
		int search = 10, count = 0;
		int i = 0;
		while (i < arr2.length) {
			if (arr2[i] == search) {
				count++;

			}
			i++;
		}
		System.out.println(count);
	}

}
