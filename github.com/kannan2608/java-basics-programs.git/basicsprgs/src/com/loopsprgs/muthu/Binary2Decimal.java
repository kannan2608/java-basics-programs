package com.loopsprgs.muthu;

public class Binary2Decimal {

	public static void main(String[] args) {
		
		int no=100111,power=0,dec=0;
		while(no>0)
		{
			dec=(int) (dec+Math.pow(2,power));
			no=no/10;
			power++;
			
		}
	
		System.out.println(dec);
	}
	

}  