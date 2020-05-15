package com.array_payilagam_vedio_prgms;

public class Max_Value_In_Array {

	public static void main(String[] args) {
		int[] a= {10,20,44,12,54,1010,77,99,01,05,06};
		int max=a[0];
	for(int i=1; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Given element max value is="+max);
	}

}
