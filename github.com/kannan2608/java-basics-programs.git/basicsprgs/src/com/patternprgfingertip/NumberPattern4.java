package com.patternprgfingertip;

public class NumberPattern4 {

	public static void main(String[] args) {
		for(int row=3; row>=1; row--)
		{
			for(int col=3; col>=row; col--)
			{
				System.out.print(col);
			}
			System.out.println();
		}
	
	}

}

/* Out Put

3
32
321

*/