package com.array_payilagam_vedio_prgms;

public class Reverse_Printing_In_Array {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
	/*	for(int i=arr.length-1; i>=0; i--)
		{
			System.out.println(arr[i]);
		}
		*/
		
		int i=arr.length-1;
		while(i>=0)
		{
			System.out.println(arr[i]);
			i--;
		}
		
		

	}

}
