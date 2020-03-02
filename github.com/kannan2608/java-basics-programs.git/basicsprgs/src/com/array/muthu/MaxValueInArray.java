package com.array.muthu;

public class MaxValueInArray {

	public static void main(String[] args) {
		int[] no = { 5, 5, -88, -7, 5, 9, 44, 77 };
		//int max =0;
		int max=Integer.MIN_VALUE;
		int i = 0;
		while (i < no.length) {
			if (max < no[i]) {
				max = no[i];

			}
			i++;
		}
		System.out.println("The Max Value in Array="+max);
	}

}
