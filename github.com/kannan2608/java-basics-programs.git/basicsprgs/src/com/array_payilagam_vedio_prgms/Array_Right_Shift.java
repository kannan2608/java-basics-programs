package com.array_payilagam_vedio_prgms;

public class Array_Right_Shift {

	public static void main(String[] args) {
		int[] a = { 10,20,30,40,50,60 };

		int temp = a[a.length - 1];
		int i = a.length - 1;
		while (i > 0) {
			a[i] = a[i - 1];
			i--;
		}
		a[0] = temp;
		System.out.println("Right Shift");
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j] + " ");
		}

	}
}
