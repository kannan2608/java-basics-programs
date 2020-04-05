package com.fingertipPrg;

public class SquareRoot {

	public static void main(String[] args) {
		int no=81,i=2;
		while(i<no/2)
		{
			if(no/i==i)
			{
				System.out.println("i is square root");
				break;
				
			}i++;
		}
	}

}
