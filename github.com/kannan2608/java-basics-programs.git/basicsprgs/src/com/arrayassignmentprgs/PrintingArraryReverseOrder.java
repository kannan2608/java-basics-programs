package com.arrayassignmentprgs;

public class PrintingArraryReverseOrder {

	public static void main(String[] args) {
		int[] reverse= {1,2,3,4,5,6,7,8,9};
		for(int i=reverse.length-1; i>=0; i--)
		{
			System.out.print( reverse[i]);
		}
	}

}
