package com.array_payilagam_vedio_prgms;

import java.util.HashSet;
import java.util.Set;

public class Find_Duplicate_Elements_In_Array_Method_2 {

	public static void main(String[] args) {
		// Set Interface using collection

		int[] a = { 1, 2, 3,1, 4, 5, 1 };
		System.out.println("Duplicate elements are:");

		Set<Integer> s = new HashSet<>();

		for (int no : a) {
			boolean b=s.add(no);
			if (b == false)
				
			{
				System.out.print(no+" ");
			}
		}

	}

}
