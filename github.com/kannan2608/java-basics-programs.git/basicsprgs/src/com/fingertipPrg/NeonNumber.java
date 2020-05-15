package com.fingertipPrg;

public class NeonNumber {

	public static void main(String[] args) {
		int no=89, sum=0;
		int sqr=no*no;
		while(sqr>0)
		{
			int digit=sqr%10;
			sum=sum+digit;
			sqr=sqr/10;
			
		}
		if(sum==no)
			System.out.println(" number  is NeonNumber");
		else {
			System.out.println("not NeonNumber");
		}
	}

}
