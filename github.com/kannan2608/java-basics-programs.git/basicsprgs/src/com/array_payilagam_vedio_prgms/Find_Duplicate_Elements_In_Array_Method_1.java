package com.array_payilagam_vedio_prgms;

public class Find_Duplicate_Elements_In_Array_Method_1 {

	public static void main(String[] args) {
		//Brutf force Method
		
		int[] a= {1,2,3,4,2,5,6,2};
		System.out.println("Duplicate value are:");
		
	
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j] && (i!=j))
				{
					System.out.print(a[j]+" ");
				}
			}
		}
		
	}

}
