package com.array_payilagam_vedio_prgms;

public class Array_Left_Shift {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		System.out.println("Before left Shift");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int temp = arr[0];
		int i = 0;
		while (i < arr.length - 1) {
			arr[i] = arr[i + 1];
			i++;

		}
		arr[i] = temp;
		System.out.println();
		System.out.println("After Left Shift");
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
	}

}
