package com.array_payilagam_vedio_prgms;

public class Insert_An_Element_Into_Array_Using_Index_Position {

	public static void main(String[] args) {
		int a[]= {10,20,30};
		int index_pos=1;
		int element=960;
		for(int i=a.length-1; i>index_pos; i--)
		{
			a[i]=a[i-1];
		}
		a[index_pos]=element;
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}

	}


