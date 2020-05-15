package com.array_payilagam_vedio_prgms;

public class Merge_Two_Array {

	public static void main(String[] args) {
		int a[]= {10,20,30,40};
		int b[]= {50,60,70,80,90,40};
		 
		
		int a_length=a.length;
		int b_length=b.length;
		int c_lenght=a_length+b_length;
		
		
		int c[]=new int[c_lenght];
		for(int i=0; i<a.length; i++)
		{
			c[i]=a[i];
			
		}
		for(int i=0; i<b.length; i++)
		{
			c[a_length+i]=b[i];
		}
		for(int i=0; i<c.length; i++)
		{
			System.out.print(c[i]+" ");
		}
	}

}
