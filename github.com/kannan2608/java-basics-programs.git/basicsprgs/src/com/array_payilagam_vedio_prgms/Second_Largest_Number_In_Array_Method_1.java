package com.array_payilagam_vedio_prgms;

public class Second_Largest_Number_In_Array_Method_1 {

	public static void main(String[] args) {
		int a[]= {6,8,2,4,3,1,9,5};
		
		int temp;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j]) 
				{
					temp=a[i];
	 			a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	//	for(int i=0; i<a.length; i++) {
			
			//System.out.print(a[i]+" ");
			System.out.println("Second Largest Element is= "+a[1]);
			
	//	}
			}

}
