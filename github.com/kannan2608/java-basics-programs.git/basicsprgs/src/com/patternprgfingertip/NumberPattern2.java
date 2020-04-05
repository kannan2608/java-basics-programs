package com.patternprgfingertip;

public class NumberPattern2 {

	public static void main(String[] args) {
		for(int row=1; row<=3; row++)
		{
			for(int col=1; col<=row; col++)
			{
				System.out.print(col);
			}
			System.out.println();
		}
	
	}

}


/* Out Put

1
12
123
*/