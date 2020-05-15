package com.array_payilagam_vedio_prgms;

public class Binary_Search_In_Array {

	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 6, 11, 13};
		
		int search = 11;
		int li = 0;
		int hi = a.length-1;
		int mid = (li + hi) / 2;

		while (li <= hi) {

			if (a[mid] == search)

			{
				System.out.println("element is at" + mid + "index position");
				break;
			} else if (a[mid] < search) {
				li = mid + 1;
			} else {
				hi = mid - 1;

			}
			mid=(li+hi)/2;

		}
		if (li > hi) {
			System.out.println("element is not present");
		}

	}
}