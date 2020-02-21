package com.loopsprgs.muthu;

public class Gcd 
{

	public static void main(String[] args)
	{
		int no1=30,no2=18;
		
		int small=no1<no2?no1:no2;
		int big1=no1>no2?no1:no2;
		while(small>=2)
		{
			if ((no1%small==0)&&(no2%small==0))
			{
				System.out.println("Gcd"+small);
				break;
				
			}
		}
		small--;
	}

}
