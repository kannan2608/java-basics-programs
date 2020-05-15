package com.array_payilagam_vedio_prgms;

public class Delete_An_Element_In_Array {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 70, 11, 12, 5 };
		int delete = 130;
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			if (delete == a[i]) {
				for (int j = i; j < a.length - 1; j++) {
					a[j] = a[j + 1];

				}
				count = count + 1;
				break;

			}
		}
		if (count == 0) {
			System.out.println("element is not a present");
		} else {
			System.out.println("element delete successfully");

			for (int i = 0; i < a.length - 1; i++) {
				System.out.println(a[i]);
			}
		}

	}
}
