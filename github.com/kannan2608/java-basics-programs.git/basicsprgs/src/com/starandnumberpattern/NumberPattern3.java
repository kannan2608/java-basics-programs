package com.starandnumberpattern;

public class NumberPattern3 {

	public static void main(String[] args) {
		for(int row=4; row>=1; row--)
		{
			for(int col=1; col<=row; col++)
			{
				System.out.print(row);
			}
			System.out.println();
		}
		
	}

}

/* Out Put

4444 
333
22
1
*/