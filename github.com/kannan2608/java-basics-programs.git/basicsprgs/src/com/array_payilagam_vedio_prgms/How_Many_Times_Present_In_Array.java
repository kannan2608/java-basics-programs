package com.array_payilagam_vedio_prgms;

public class How_Many_Times_Present_In_Array {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60, 10, 70, 10 };
		int key = 8, count = 0, i = 0;
		while (i < arr.length) {
			if (key == arr[i]) {
				count++;
			}
			i++;
		}
		if (count > 0)
			System.out.println(key + " is present " + count + " times");
		else
			System.out.println(key + " is not present");

	}

}
