package com.array.muthu;

public class AddingNewElement {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6 };
		int no = 93;
		int len = arr1.length;
		int[] arr2 = new int[len + 1];
		int len2 = arr2.length;
		arr2[len2 - 1] = no;
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
			// System.out.println(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

	}

}
