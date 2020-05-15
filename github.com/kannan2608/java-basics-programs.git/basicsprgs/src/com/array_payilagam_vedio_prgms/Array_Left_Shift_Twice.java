package com.array_payilagam_vedio_prgms;

public class Array_Left_Shift_Twice {

	public static void main(String[] args) {
		
		
		int[] a= {10,20,30,40,50,60};
		System.out.println("Before Left shift");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		int temp1=a[0];
		int temp2=a[1];
		int i=0;
		while(i<a.length-2)
		{
			a[i]=a[i+2];
			i++;
		}
		a[i]=temp1;
		a[i+1]=temp2;
		System.out.println();
		System.out.println("after Left Shift");
		
			for(int j=0; j<a.length; j++)
			{
				System.out.print(a[j]+" ");
			}
		}
		
	}


