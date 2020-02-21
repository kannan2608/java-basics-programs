package com.loopsprgs.muthu;

public class ReverseOrder 
{

	public static void main(String[] args)
	{  
		int noofdigits=0;
		int no=123456;
		int rem;
		while(no>0)
		{
			rem=no%10;
			System.out.println(rem);
			no=no/10;
			noofdigits++;
	
		}
		System.out.println("how many times loops = "+noofdigits);
	}
	
	

}
