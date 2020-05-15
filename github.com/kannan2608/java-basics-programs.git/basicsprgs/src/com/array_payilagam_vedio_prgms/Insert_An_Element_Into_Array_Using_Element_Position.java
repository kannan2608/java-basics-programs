package com.array_payilagam_vedio_prgms;

public class Insert_An_Element_Into_Array_Using_Element_Position {

	public static void main(String[] args) {
		int a[]= {10,20,30};
		int pos=1;
		int element=960;
		for(int i=a.length-1; i>pos-1; i--)
		{
			a[i]=a[i-1];
		}
		a[pos-1]=element;
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}

}
