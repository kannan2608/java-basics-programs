package com.array_payilagam_vedio_prgms;

public class Smallest_Number_In_Array {

	public static void main(String[] args) {
		int[] a= {90,80,44,15,96,6};
		int small=Integer.MAX_VALUE;
		int i=1;
		while(i<a.length)
		{
			if(a[i]<small)
			{
				small=a[i];
			}
			i++;
		}
		System.out.println("Smallest arry in= "+small);
	}

}
