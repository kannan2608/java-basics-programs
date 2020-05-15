package com.array_payilagam_vedio_prgms;

public class Finding_Dupulicate_Array {

	public static void main(String[] args) {
		int[] a = { 10, 20, 10, 30, 40, 10, 20, 50, 20,30};
		
		int[] frq=new int[a.length];
		for(int i=0; i<a.length; i++)
		{
			int no=a[i];
			int count=1;
			for(int j=i+1; j<a.length; j++)
			{
				if(no==a[j])
				{
					count++;
					frq[j]=-1;
				
				}
			}
			if(frq[i]!=-1)
			{
				frq[i]=count;
			}
		}
		int countofduplicates=0;
		for(int i=0; i<frq.length; i++)
		{
			if(frq[i]>1)
			{
			   countofduplicates++;
			}
		}
		System.out.println("Total no of duplicate"+countofduplicates);
	}

}
