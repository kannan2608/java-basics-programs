package com.array.muthu;

public class CountingDuplicateUsingArray {

	public static void main(String[] args) {
		int[] arr = { 10, 10, 20, 30, 20, 20, 40, 10, 10, 50 };
		int[] search = { 10, 20 };
		int j = 0;
		while (j < search.length) {
			int i = 0, count = 0;
			while (i < arr.length) {
				if (arr[i] == search[j]) {
					count++;

				}
				i++;

			}
			System.out.println("The Count of is="+ count +"times");
			
			j++;
		}

	}

}
