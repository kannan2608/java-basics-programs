package com.array.muthu;

public class MinandMaxValueInArray {

	public static void main(String[] args) {
		
		int[] no = { 5, 88, 9, 44, 77 };
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		int i = 0;
		while (i < no.length) {
			if (min > no[i]) {
				min = no[i];

			}
			if (max < no[i]) {
				max = no[i];

			}
			i++;
		}
		System.out.println("The Min Value in Array="+min);
		System.out.println("The Max Value in Array="+max);
	} 
	}


