package com.loopsprgs.muthu;

public class SumofDigitLastSingleNumber {

	public static void main(String[] args) {
		int no=1124,sum,prod;
		do {
			 sum=0;
			 prod=1;
			while(no>0)
			{
				int rem=no%10;
				sum=sum+rem;
				prod=prod+rem;
				no=no/10;
			}
		no=sum; 
		}
		while(sum>9);
			
			
			System.out.println(sum);
		}
		
}

