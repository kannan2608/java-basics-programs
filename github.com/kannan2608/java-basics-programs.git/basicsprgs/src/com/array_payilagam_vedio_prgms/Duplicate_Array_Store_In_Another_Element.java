package com.array_payilagam_vedio_prgms;

public class Duplicate_Array_Store_In_Another_Element {

	public static void main(String[] args) {
	
		int[] a = { 10, 20, 10, 30,10,20,30, 40, 50, 60, 20 };
		int[] b=new int[a.length];
		
		int[] frq = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int no = a[i];
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (no == a[j]) {
					count++;
					frq[j] = -1;

				}
			}
			if (frq[i] != -1) {
				frq[i] = count;
			}
		}
		int j=0;
		for (int i = 0; i < frq.length; i++) {
			if (frq[i] >1) {
				b[j]=a[i];
				j++;
			}
		}
		System.out.println("Duplicate arry in");

		for(int i=0; i<b.length; i++)
		{
			if(b[i]>0)
				System.out.print(b[i]+" ");
		}

	}


		
		
		
	}
