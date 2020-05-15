package com.array_payilagam_vedio_prgms;

public class Counting_Unique_Element_In_Array {

	public static void main(String[] args) {
		int[] a = { 10, 20, 10, 30, 40, 50, 60, 20 };

		int[] frq = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int no = a[i];
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (no == a[j]) {
					count++;
					frq[j] = -1;

				}
			}
			if (frq[i] != -1) {
				frq[i] = count;
			}
		}
		int unique = 0;
		for (int i = 0; i < frq.length; i++) {
			if (frq[i] == 1) {
				unique++;
			}
		}
		System.out.println("Total no of unique element count is" + unique);

	}

}
