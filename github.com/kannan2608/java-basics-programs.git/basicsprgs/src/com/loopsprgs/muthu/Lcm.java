package com.loopsprgs.muthu;

public class Lcm {

	public static void main(String[] args) {
		int no1=6,no2=4;
	int big=no1>no2?no1:no2;
	int small=no1<no2?no1:no2;
	while(true)
	{
		if(big%small==0)   
		{
			System.out.println(big);
			System.out.println(small);
			break;
			
			
	
		}
	
	big+=no2;
	}
	
	
	}

}
