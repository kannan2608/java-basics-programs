package com.array_payilagam_vedio_prgms;

public class Reverse_In_Array {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50,60,70,80};
		int i = 0, j = arr.length - 1;
		System.out.println("Befor Printing in Array");
		
		for(int i1=0; i1<arr.length; i1++)
		{
			System.out.println(arr[i1]);
		}
	
		while (i <j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;

		}
		System.out.println();
		
		System.out.println("After Reversing array is");
		for(int k=0; k<arr.length; k++)
		{
			System.out.println(arr[k]+"");
		}
	}
}
