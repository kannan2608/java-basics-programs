package com.array.muthu;

public class MinValueInArray {

	public static void main(String[] args) {
		int[] no = { 5, 88, 9, 44, 77 };
		//int max =0;
		int min=Integer.MAX_VALUE;
		int i = 0;
		while (i < no.length) {
			if (min > no[i]) {
				min = no[i];

			}
			i++;
		}
		System.out.println("The Min Value in Array="+min);
	}

	}


