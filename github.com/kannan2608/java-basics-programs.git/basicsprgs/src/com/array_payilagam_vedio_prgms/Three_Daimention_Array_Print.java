package com.array_payilagam_vedio_prgms;

public class Three_Daimention_Array_Print {

	public static void main(String[] args) {
		int[][][] a = { { { 10, 20, 30, 40 }, { 50, 60, 70, 80 } }, { { 90, 100, 110, 120 }, { 130, 140, 150, 16 } } };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					System.out.print(a[i][j][k] + " ");
				}
				System.out.println();
			}
		}

	}

}
