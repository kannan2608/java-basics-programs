package com.array.muthu;

public class SecondMaxInArray {

	public static void main(String[] args) {

		int[] marks = { 63, 64, 88, 93, 45, 91 };
		int max = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int i = 0;
		while (i < marks.length) {
			if (marks[i] > max) {
				max2 = max;
				max = marks[i];
			}
			else if(marks[i]>max2)
			{
				max2=marks[i];
				
			}
			i++;
		}
		System.out.println("The First Max value in Array="+ max);
		System.out.println("The Second Max value in Array=" +max2);

	}

}
