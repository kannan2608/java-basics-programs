package com.fingertipPrg;

public class Factorial1 {

	public static void main(String[] args) {
	int fact=1,num=5,i=num;
	while(i>0)
	{
		while(num>0)
		{
			fact=fact*num;
			num--;
			System.out.println(fact);

		}
		//System.out.println(fact);
		i--;
		num=i;
	}

	}

}
