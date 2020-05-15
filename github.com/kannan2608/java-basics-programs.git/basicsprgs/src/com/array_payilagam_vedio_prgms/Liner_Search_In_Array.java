package com.array_payilagam_vedio_prgms;

public class Liner_Search_In_Array {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50, 60 };
		int key = 89, i = 0;
		while (i < a.length) {
			if (key == a[i]) {
				System.out.println(key +" is Present in  " +  i  + "  position");
				break;
			}
			i++;

		}
		if (i == a.length) {
			System.out.println(key + "  is not present in arrray");
		}

	}

}
