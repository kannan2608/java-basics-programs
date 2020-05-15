package com.array_payilagam_vedio_prgms;

public class Min_Value_In_Array {

	public static void main(String[] args) {
		int[] a= {99,50,5,-9,88,11,01,05,101};
		
		int min=a[0];
		
		for(int i=1; i<a.length; i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Given element in array minmum value is= "+min);
	}
	
	

}
