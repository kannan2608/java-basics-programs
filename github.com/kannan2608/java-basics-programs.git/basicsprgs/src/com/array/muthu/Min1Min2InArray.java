package com.array.muthu;

public class Min1Min2InArray {

	public static void main(String[] args) {
		int[] marks = { 63, 64, 88, 93, 45, 91 };
		int min = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		int i = 0;
		while (i < marks.length) {
			if (marks[i] <min) {
				min2 = min;
				min = marks[i];
			}
			else if(marks[i]<min)
			{
				min2=marks[i];
				
			}
			i++;
		}
		System.out.println("The First Min value in Array="+ min);
		System.out.println("The Second Min value in Array=" +min2);

	}

}
