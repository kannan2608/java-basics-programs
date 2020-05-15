package com.array_payilagam_vedio_prgms;

public class Selection_Short {

	public static void main(String[] args) {

		int[] a = { 38, 45, 10, 58, 10, 99, 3, 18 };
		int min, temp = 0;
		for (int i = 0; i < a.length; i++) {
			min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;

				}
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
