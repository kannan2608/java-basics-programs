package com.patternprgfingertip;

public class NumberPattern1 {

	public static void main(String[] args) {
		for(int row=1; row<=3; row++)
		{
			for(int col=1; col<=row; col++)
			{
				System.out.print(row);
			}
			System.out.println();
		}
	}

}
/* Out put

1
22
333
*/