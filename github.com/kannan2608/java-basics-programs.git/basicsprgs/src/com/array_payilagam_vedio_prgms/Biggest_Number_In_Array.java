package com.array_payilagam_vedio_prgms;

public class Biggest_Number_In_Array {

	public static void main(String[] args) {
		int[] a= {55,99,64,88,70,88,96};
		int i=0; 
		int big=Integer.MIN_VALUE;
		while(i<a.length)
		{
			if(a[i]>big)
			{
				big=a[i];
				
			}
			i++;
		}
		System.out.println("Bigest In Array is="+ big);
	}

}
